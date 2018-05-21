package com.development.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.development.model.Register_Account;
import com.development.model.Register_ph;

@Controller
public class Spring_Concepts_here {

	/*
	Error:(6, 31) java: cannot find symbol
  symbol:   class Valid
  location: package org.hibernate.validator
	 */
	@RequestMapping(value="/spring_main")
	public String home_spring(Model model) {
		return "spring_home";
	}
	
	
	@RequestMapping(value="/spring_controller")
	public String spring_controller(Model model) {
		return "spring_controller";
	}
	
	@RequestMapping(value="/Spring_controller_request_mapping_post"
			, method=RequestMethod.POST)
	public String Spring_controller_request_mapping_post(Model model, HttpServletRequest req, HttpServletResponse res) {
		
		String first_name = req.getParameter("first_name");
		String last_name =  req.getParameter("last_name");
		Register_Account  acc =  new Register_Account();
		acc.setFirst_name(first_name);
		acc.setLast_name(last_name);

		System.out.println("-----------------------" +  first_name +  last_name);
		String name = first_name +" " +  last_name;
		model.addAttribute("name", name);
		return "spring_mapping_post_to_controller";
	}
	
	@RequestMapping(value="/spring_view")
	public String Spring_view(Model model) {
		return "spring_view";
	}
	
	@RequestMapping(value="/spring_forward", method=RequestMethod.POST)
	public String spring_forward(@ModelAttribute Register_Account reg_acc) {
		
			return "redirect:spring_forward_another";
	}
	
	
	@RequestMapping(value="/spring_forward_another")
	public String spring_forward_another(Model model) {
		return "spring_view";
	}
	
	@RequestMapping(value="/spring_tags")
	public String spring_tags(Model model) {
		return "spring_tags";
	}
	
	@RequestMapping(value="/spring_validation")
	public String spring_validation(Model model) {
		return "spring_validation";
	}
	
	/*
	@RequestMapping(value="/Spring_validation_page", method=RequestMethod.POST)
	public String Spring_validation_page( Model model,@javax.validation.Valid @ModelAttribute("reg_ph") Register_ph reg_ph,BindingResult result) {
		
		System.out.println(result.hasErrors());
		return "spring_validation";
	}
	*/
	
	@ModelAttribute("reg_ph")
	public Register_ph createModel() {
	    return new Register_ph();
	}
	
	@RequestMapping(value="/spring_ajax")
	public String spring_ajax(Model model) {
		return "spring_ajax";
	}
	
	@RequestMapping(value="/spring_security")
	public String spring_security(Model model) {
		return "spring_security";
	}
	
	
}

