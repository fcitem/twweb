package com.telewave.twweb.common.jsonResolve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.telewave.twweb.firstds.entity.User;

public class JsonResolve {
	public static <T> String toJson(Object obj){
		Gson gson=new Gson();
			//post请求
		String json=gson.toJson(obj);
			/*try{
				T jsonObj=gson.fromJson(json, classType);
			}catch(Exception e){
				e.printStackTrace();
			}*/
			return json;
	}
	public static void main(String[] args) {
		test t=new test();
		User user=new User();
		user.setUserName("fc");
		user.setUserPwd("asd1323");
		user.setLoginId("12");
		ArrayList<User> list=new ArrayList<User>();
		User user2=new User();
		user2.setUserName("fc2");
		user2.setUserPwd("asd1323");
		user2.setLoginId("122");
		Map map=new HashMap<String,String>();
		map.put("a", "fc");
		map.put("2", "hhj");
		list.add(user);
		list.add(user);
		t.setUser(user);
		String str=JsonResolve.toJson(t);
		System.out.println(str);
	}
}
class test{
	User user=new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
			/*	users u=gson.fromJson(json, classType);
				System.out.println(u.getUsername());
			}catch(Exception e){
				e.printStackTrace();
			}*/
		/*public <T> void send(Object obj,Class<T> classType){
		Gson gson=new Gson();
		T object = (T) obj;
		String name=classType.getName();
		try {
			//post请求
			String json=gson.toJson(object);
			try{
				users u=gson.fromJson(json, classType);
				System.out.println(u.getUsername());
			}catch(Exception e){
				e.printStackTrace();
			}
			out.write(json);
			out.flush();
			out.close();
			connect.getInputStream();  //此处才是真正的发送数据
//			connect.getResponseCode(); //此处才是真正的发送数据
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
