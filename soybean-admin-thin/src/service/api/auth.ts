import { mockRequest } from '../request';
import axios from "axios";
import {router} from "@/router";
/**
 * axios登录
 */
export function axiosLogin(userName: string, password: string){

	axios.post('/api/user/login',{
		userName:userName,
		password:password
	}).then(res=>{
		if(res.data===true){
			console.log(res)
			console.log('登录成功')
			router.push('/slw/zhr');
		}else {
			console.log('登录失败')
			router.push('/');
		}
	}).catch(error=>{
		router.push('/slw/jc');
		console.log(error)
	})

}
/**
 * 获取验证码
 * @param phone - 手机号
 * @returns - 返回boolean值表示是否发送成功
 */
export function fetchSmsCode(phone: string) {
  return mockRequest.post<boolean>('/getSmsCode', { phone });
}

/**
 * 登录
 * @param userName - 用户名
 * @param password - 密码
 */
export function fetchLogin(userName: string, password: string) {
	//return mockRequest.post<ApiAuth.Token>('url-pattern/user/login', { userName, password });

  return mockRequest.post<ApiAuth.Token>('/login', { userName, password });
	//return axios.post('url-pattern/user/login',{userName,password});
}

/** 获取用户信息 */
export function fetchUserInfo() {
  return mockRequest.get<ApiAuth.UserInfo>('/getUserInfo');
}

/**
 * 获取用户路由数据
 * @param userId - 用户id
 * @description 后端根据用户id查询到对应的角色类型，并将路由筛选出对应角色的路由数据返回前端
 */
export function fetchUserRoutes(userId: string) {
  return mockRequest.post<ApiRoute.Route>('/getUserRoutes', { userId });
}

/**
 * 刷新token
 * @param refreshToken
 */
export function fetchUpdateToken(refreshToken: string) {
  return mockRequest.post<ApiAuth.Token>('/updateToken', { refreshToken });
}
