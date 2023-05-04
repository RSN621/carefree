package com.nz.shiro;

import com.nz.dao.RoleDao;
import com.nz.entity.user;
import com.nz.service.RoleService;
import com.nz.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class MyRealm extends AuthorizingRealm{
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private RoleDao roleDao;
	//获得验证主体

	//为当前登录的Subject授予角色和权限
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("开始授权");
		//初始反参
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
		//共享token中的Subject主体，获取当前用户的用户名
		String username= (String) principals.getPrimaryPrincipal();
		Subject subject = SecurityUtils.getSubject();
		Session session=subject.getSession();
		List<String> permissionList = new ArrayList<>();
		permissionList.add("super");
		info.addRoles(permissionList);
		session.setAttribute("permissions",permissionList);
		return info;
	}

	@Override
	//验证当前登录的Subject
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//得到邮箱
		String email = (String)token.getPrincipal();
		//得到密码
		String password = new String((char[])token.getCredentials());
		//调原逻辑 登录代码
		//获取用户
		Subject subject = SecurityUtils.getSubject();
		Session session=subject.getSession();
		user user =(user)session.getAttribute("user");
		if(user!=null) {
			//获得当前对象
			//如果配置了MD5凭证规则，token内的明文密码就完成凭证规则下的加密工作，由shiro完成加密对比
			//token记录用户输入的账号和密码，数据库记录用户账号和MD5密码
			//无盐
			//AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(), user.getNickname());
			//加盐
			AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getEmail(),user.getPassword(),
					ByteSource.Util.bytes(user.getSalt()),user.getName());
			//如果身份认证验证成功，返回一个AuthenticationInfo实现；
			//AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(username, password, getName());
			return authcInfo;
		}
		return null;

	}

}
