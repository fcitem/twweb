package com.telewave.twweb.firstds.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.telewave.twweb.common.jsonResolve.JsonResolve;
import com.telewave.twweb.firstds.entity.User;

@Controller
@RequestMapping("Login")
public class loginController{
	@ResponseBody
	@RequestMapping(value="loginValidate",method=RequestMethod.POST)
	public User login(HttpServletRequest request,HttpServletResponse response,String userName,String passWord){
		response.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");
		Subject sub=SecurityUtils.getSubject();
		User user=new User();
		UsernamePasswordToken token=new UsernamePasswordToken(userName,passWord);
		try{
			sub.login(token);
		}catch (Exception e) {
			System.out.println("登录失败");
		}
		try{
			sub.checkPermission("user:update");
			System.out.println("权限验证通过");
		}catch (AuthorizationException e) {
			System.out.println("用户没有相应的权限");
		}
		try {
			user.setUserId("asdnas");
			user.setUserName("dx");
			user.setUserPwd("132215");
//			response.getWriter().write(JsonResolve.toJson(user));
//			request.setAttribute("user",user);
//			response.getWriter().write(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
