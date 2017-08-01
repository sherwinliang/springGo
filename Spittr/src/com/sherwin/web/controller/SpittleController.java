package com.sherwin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sherwin.data.SpittleRepository;

@Controller
public class SpittleController {

	private SpittleRepository spittleRepository;
	@Autowired
	public SpittleController(SpittleRepository spittleRepository){
		this.spittleRepository = spittleRepository;
	}
	//Use model to transit data
	@RequestMapping(value="/spittles", method=RequestMethod.GET)
	public String spittles(Model model){
		model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}
	//Get parameter from URL
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showSpittle(@RequestParam("spittle_id") long spittleId, Model model){
		model.addAttribute(spittleRepository.findOne(spittleId));
		return "spittle";
	}
	//Get path variable
	@RequestMapping(value="/spittles/(spittleId)", method=RequestMethod.GET)
	public String spittle(@PathVariable("spittleId") long spittleId, Model model){
		model.addAttribute(spittleRepository.findOne(spittleId));
		return "spittle";
	}
}
