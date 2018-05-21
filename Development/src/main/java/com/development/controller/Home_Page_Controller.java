package com.development.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home_Page_Controller {
	
	@RequestMapping(value="/home")
	public String Home(Model model) {
		
		try {
			// I tried to read the file but File not readng from the resources
			//so come up with this type code
			FileReader fr =  new FileReader("E:\\spring tool\\Development\\src\\main\\resources\\main.txt");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		model.addAttribute("Greeting", "shashi");
		return "home";
	}

}
