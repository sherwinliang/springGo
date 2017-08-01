package com.sherwin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sherwin.data.SpitterRepository;
import com.sherwin.dto.Spitter;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
	private SpitterRepository spitterRepository;

	public SpitterController(){}
	
	@Autowired
	public SpitterController(SpitterRepository spitterRepository){
		this.spitterRepository = spitterRepository;
	}
	
	@RequestMapping(value="/register", method=GET)
	public String showRegistrationForm(){
		return "registerForm";
	}
	//Parameters in the Form will auto set in to spitter, 
	@RequestMapping(value="/register", method=POST)
	public String processRegistration(Spitter spitter){
		spitterRepository.save(spitter);
		return "redirect:/spitter/" + spitter.getUsername();
	}
}
