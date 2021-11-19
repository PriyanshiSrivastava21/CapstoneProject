package com.simplilearn.webservices.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.simplilearn.webservices.model.User;
import com.simplilearn.webservices.repository.UserRepository;

@Controller
public class HomeController {
	@Autowired
	private UserRepository repo;
	
	@RequestMapping("/home")
	public String home()
	{
		return "registration"; 
	}
	@RequestMapping("/")
	@ResponseBody
	public String Empty()
	{
		return "hello home";
	}
	@RequestMapping("/getData")
	public String getData(HttpServletRequest req)
	{
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		HttpSession session =  req.getSession();
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		return "home";
	}
	
	@RequestMapping("/getloginData")
	public ModelAndView getLoginData(@RequestParam("username")String username,@RequestParam("password")String password)

	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("username",username);
		mv.addObject("password",password);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/getUserData")
	public ModelAndView getUserData(User user)
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("home");
		return mv;
	}
}

