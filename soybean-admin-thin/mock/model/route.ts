export const routeModel: Record<Auth.RoleType, AuthRoute.Route[]> = {
  super: [
		{
			name: 'slw',
			path: '/slw',
			component: 'basic',
			meta: {
				title: '305寝室',
				icon: 'icon-park-outline:all-application',
				order: 6
			},
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
		},
    {
      name: 'multi-menu',
      path: '/multi-menu',
      component: 'basic',
      children: [
        {
          name: 'multi-menu_first',
          path: '/multi-menu/first',
          component: 'multi',
          children: [
            {
              name: 'multi-menu_first_second',
              path: '/multi-menu/first/second',
              component: 'self',
              meta: {
                title: '二级菜单',
                requiresAuth: true,
                icon: 'mdi:menu'
              }
            },
            {
              name: 'multi-menu_first_second-new',
              path: '/multi-menu/first/second-new',
              component: 'multi',
              children: [
                {
                  name: 'multi-menu_first_second-new_third',
                  path: '/multi-menu/first/second-new/third',
                  component: 'self',
                  meta: {
                    title: '三级菜单',
                    requiresAuth: true,
                    icon: 'mdi:menu'
                  }
                }
              ],
              meta: {
                title: '二级菜单(有子菜单)',
                icon: 'mdi:menu'
              }
            }
          ],
          meta: {
            title: '一级菜单',
            icon: 'mdi:menu'
          }
        }
      ],
      meta: {
        title: '多级菜单',
        icon: 'carbon:menu',
        order: 1
      }
    }
  ],
  admin: [
    {
      name: 'multi-menu',
      path: '/multi-menu',
      component: 'basic',
      children: [
        {
          name: 'multi-menu_first',
          path: '/multi-menu/first',
          component: 'multi',
          children: [
            {
              name: 'multi-menu_first_second',
              path: '/multi-menu/first/second',
              component: 'self',
              meta: {
                title: '二级菜单',
                requiresAuth: true,
                icon: 'mdi:menu'
              }
            },
            {
              name: 'multi-menu_first_second-new',
              path: '/multi-menu/first/second-new',
              component: 'multi',
              children: [
                {
                  name: 'multi-menu_first_second-new_third',
                  path: '/multi-menu/first/second-new/third',
                  component: 'self',
                  meta: {
                    title: '三级菜单',
                    requiresAuth: true,
                    icon: 'mdi:menu'
                  }
                }
              ],
              meta: {
                title: '二级菜单(有子菜单)',
                icon: 'mdi:menu'
              }
            }
          ],
          meta: {
            title: '一级菜单',
            icon: 'mdi:menu'
          }
        }
      ],
      meta: {
        title: '多级菜单',
        icon: 'carbon:menu',
        order: 8
      }
    }
  ],
  user: [
    {
      name: 'multi-menu',
      path: '/multi-menu',
      component: 'basic',
      children: [
        {
          name: 'multi-menu_first',
          path: '/multi-menu/first',
          component: 'multi',
          children: [
            {
              name: 'multi-menu_first_second',
              path: '/multi-menu/first/second',
              component: 'self',
              meta: {
                title: '二级菜单',
                requiresAuth: true,
                icon: 'mdi:menu'
              }
            },
            {
              name: 'multi-menu_first_second-new',
              path: '/multi-menu/first/second-new',
              component: 'multi',
              children: [
                {
                  name: 'multi-menu_first_second-new_third',
                  path: '/multi-menu/first/second-new/third',
                  component: 'self',
                  meta: {
                    title: '三级菜单',
                    requiresAuth: true,
                    icon: 'mdi:menu'
                  }
                }
              ],
              meta: {
                title: '二级菜单(有子菜单)',
                icon: 'mdi:menu'
              }
            }
          ],
          meta: {
            title: '一级菜单',
            icon: 'mdi:menu'
          }
        }
      ],
      meta: {
        title: '多级菜单',
        icon: 'carbon:menu',
        order: 7
      }
    }
  ]
};
