declare namespace RouterPage {
  /** 根路由 */
  type RootRouteKey = 'root';

  /** 未找到路由(捕获无效路径的路由) */
  type NotFoundRouteKey = 'not-found';

  /** 页面路由 */
  type RouteKey =
    | '403'
    | '404'
    | '500'
    | 'constant-page'
    | 'login'
    | 'multi-menu'
    | 'multi-menu_first'
    | 'multi-menu_first_second'
    | 'multi-menu_first_second-new'
    | 'multi-menu_first_second-new_third'
    | 'not-found'
    | 'slw'
    | 'slw_ccl'
    | 'slw_hyq'
    | 'slw_jc'
    | 'slw_zhr';

  /** 最后一级路由(该级路有对应的vue文件) */
  type LastDegreeRouteKey = Extract<RouteKey, '403' | '404' | '500' | 'constant-page' | 'login' | 'multi-menu_first_second' | 'multi-menu_first_second-new_third' | 'not-found' | 'slw_ccl' | 'slw_hyq' | 'slw_jc' | 'slw_zhr'>
}
