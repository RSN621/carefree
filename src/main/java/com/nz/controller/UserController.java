package com.nz.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nz.dao.RoleDao;
import com.nz.dao.UserDao;
import com.nz.entity.role;
import com.nz.entity.user;
import com.nz.service.RoleService;
import com.nz.service.UserService;
import com.nz.util.GeneralUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private RoleDao roleDao;
    @RequestMapping("/Select")
    @ResponseBody
    public List<user> findAll(){
        List<user> list= userDao.selectList(null);
        return  list;
    }
    @RequestMapping("/login")
    @ResponseBody
    public JSONObject login(HttpSession session,@RequestBody Map map) {
        String email= (String) map.get("userName");
        String password= (String) map.get("password");
        System.out.println("邮箱:"+email+"密码："+ password);
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("email",email);
        user user=userDao.selectOne(queryWrapper);
        session.setAttribute("user",user);
        //创建token,包含传参账号和密码
        UsernamePasswordToken token = new UsernamePasswordToken(email,password);
        //获得验证主体
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        System.out.println("isAuthenticated:" + subject.isAuthenticated());
        if(user!=null){
            System.out.println(user);
            JSONObject json=new JSONObject();
            json.put("code",200);
            JSONObject json1=new JSONObject();
            json1.put("token","__TOKEN_SOYBEAN__");
            json1.put("refreshToken","__REFRESH_TOKEN_SOYBEAN__");
            json.put("data",json1);
            return json;
        }else {
            JSONObject json3=new JSONObject();
            json3.put("message","登录失败");
            return json3;
        }
    }
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public JSONObject getUserInfo(HttpSession session){
        user user= (com.nz.entity.user) session.getAttribute("user");
        QueryWrapper queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_id",user.getId());
        role role=roleDao.selectOne(queryWrapper);
        JSONObject json=new JSONObject();
        json.put("code",200);
        JSONObject json1=new JSONObject();
        json1.put("userId",role.getUser_id());
        json1.put("userName",user.getName());
        json1.put("userRole",role.getUser_role());
        json.put("data",json1);
        return json;
    }
    @RequestMapping("/register")
    @ResponseBody
    public boolean register(@RequestBody user user) throws IOException {
        String salt= GeneralUtil.generateCode();
        SimpleHash MD5passwordSalt = new SimpleHash("md5", user.getPassword(), salt, 1);
        user.setEmail(user.getEmail());user.setPassword(MD5passwordSalt.toString()); user.setName(user.getName());user.setSalt(salt);
        int a =userDao.insert(user);
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("email",user.getEmail());
        user user1=userDao.selectOne(queryWrapper);
        role role=new role();
        role.setUser_id(user1.getId());
      //默认注册用户权限都为普通user
      role.setUser_role("user");
      roleDao.insert(role);
      boolean result=false;
    if(a>0){
        result=true;
    }else {
        result=false;
    }
        return result;
    }
}
