package com.sherwin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class HomeController {
	//Achieve basic MVC function
	@RequestMapping(value="/", method=GET)
	public String home(){
		return "home";
	}
}