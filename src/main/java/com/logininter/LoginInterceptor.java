package com.logininter;

import com.google.gson.Gson;
/*import com.weixin.entity.WxSetting;
import com.weixin.service.WxSettingService;
import com.weixin.serviceImpl.WxSettingServiceImpl;*/


import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @since LoginInterceptor 
 * @author HuWang
 * @see LoginInterceptor extends HandlerInterceptorAdapter
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
	private Logger log = Logger.getLogger(super.getClass());

	private static final String[] IGNORE_URI = {".","/admin/"};

	Gson gson = new Gson();
	Map<String, Object> map = new HashMap();

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		/*HttpSession session = request.getSession();
		StringUtil ss = new StringUtil();
		String oppen_id = ss.getOppen_id(session);
		System.out.println("LoginInterceptor.java oppen_id="
				+ ss.getOppen_id(session));*/
		
		boolean flag = false;
		//flag = (oppen_id != null ? true : false);
		String url = (request.getRequestURL() + "?" + request.getQueryString())
				.toString();
		System.out.println(">>>1: " + url);
		for (String s : IGNORE_URI) {
			if (url.contains(s)) {
				flag = true;
				break;
			}
		}
		this.log.info("url>>>2: " + url);
		
		this.log.info("最终 111flag==" + flag + "进图判断获取用户信息");
		System.out.println("//////////////////////////////////"+flag);
		return flag;
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}
}