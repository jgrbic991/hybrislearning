package com.jecika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnotherController {
	
@RequestMapping(value="/another", method=RequestMethod.GET)
	public String helloWorld()
	{
		String message = "Bravo peroooo";
		System.out.println("pera je pozvan");
		return "another"; //new ModelAndView("another", "msg", message);
		
	}
}
