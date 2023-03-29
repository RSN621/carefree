import { defineConfig, loadEnv } from 'vite';
import { getRootPath, getSrcPath, setupVitePlugins } from './build';
//import { getServiceEnvConfig } from './.env-config';

export default defineConfig(configEnv => {
  const viteEnv = loadEnv(configEnv.mode, process.cwd()) as unknown as ImportMetaEnv;

  const rootPath = getRootPath();
  const srcPath = getSrcPath();

  //const isOpenProxy = viteEnv.VITE_HTTP_PROXY === 'Y';
  //const envConfig = getServiceEnvConfig(viteEnv);

  return {
    base: viteEnv.VITE_BASE_URL,
    resolve: {
      alias: {
        '~': rootPath,
        '@': srcPath,
        'vue-i18n': 'vue-i18n/dist/vue-i18n.cjs.js'
      }
    },
    plugins: setupVitePlugins(viteEnv),
    css: {
      preprocessorOptions: {
        scss: {
          additionalData: `@use "./src/styles/scss/global.scss" as *;`
        }
      }
    },
    server: {
      host: '0.0.0.0',
      port: 3200,
      open: true,
      proxy: {
				'/api': {
					target: 'http://localhost:8080/', // 对应自己的接口
					changeOrigin: true,
					ws: true,
					rewrite: path => path.replace(/^\/api/, '') // 重写路径把路径变成空字符
				}
			}
    },
    build: {
      reportCompressedSize: false,
      sourcemap: false,
      commonjsOptions: {
        ignoreTryCatch: false
      }
    }
  };
});
