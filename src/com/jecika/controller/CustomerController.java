package com.jecika.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class CustomerController extends MultiActionController {
	
	@RequestMapping("/customer/proba")
	public ModelAndView jecaprobatest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("CustomerPage", "poruka", "Ovo je proba metoda");
	}
	
	@RequestMapping("/customer/oduzmi")
	public ModelAndView jecaoduzmitest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("CustomerPage", "poruka", "Ovo je oduzmi metoda");
	}
	}

