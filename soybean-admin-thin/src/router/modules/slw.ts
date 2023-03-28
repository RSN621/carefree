const slw: AuthRoute.Route = {
  name: 'slw',
  path: '/slw',
  component: 'basic',
  children: [
    {
      name: 'slw_jc',
      path: '/slw/jc',
      component: 'self',
      meta: {
        title: '江璨',
        requiresAuth: true,
        icon: 'bi:0-circle-fill'
      }
    },
    {
      name: 'slw_ccl',
      path: '/slw/ccl',
      component: 'self',
      meta: {
        title: '曹超零',
        requiresAuth: true,
        icon: 'bi:0-circle'
      }
    },
    {
      name: 'slw_zhr',
      path: '/slw/zhr',
      component: 'self',
      meta: {
        title: '用户展示',
        requiresAuth: true,
        icon: 'mdi:account'
      }
    },
    {
      name: 'slw_hyq',
      path: '/slw/hyq',
      component: 'self',
      meta: {
        title: '音乐展示',
        requiresAuth: true,
        icon: 'ri:bilibili-line'
      }
    }
  ],
  meta: {
    title: '305寝室',
    icon: 'icon-park-outline:all-application',
    order: 6
  }
};
export default slw;
