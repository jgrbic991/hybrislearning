package com.jecika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("/")
	public String helloWorld()
	{
		String message = "Bravo jecooooo";
		System.out.println("kontroler je pozvan");
		return "welcome";//new ModelAndView("welcome", "msg", message);
		
	}
	
	
}
