package com.plants.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.plants.entity.MyBotanicList;
import com.plants.entity.plants;
import com.plants.service.MyBotanicListservice;
import com.plants.service.plantsservice;

@Controller
public class Plantcontroller {
@Autowired
private plantsservice service;
@Autowired
private MyBotanicListservice myplantsService;
	@GetMapping("/")
    public String home() {
		return "home";
	}
	@GetMapping("/Plant_Profile_Setup")
	public String PlantProfileSetup() {
		return "plantregistration";
	}
	@GetMapping("/Flora_Collection")
	public ModelAndView getAllplants() {
		List<plants> list=service.getAllplants();
		//ModelAndView m=new ModelAndView();
		//m.setViewName("plantlist");
		//m.addObject("plant",list);
		return new ModelAndView("plantlist","plants",list);
	}
	@PostMapping("/save")
	public String addPlant(@ModelAttribute plants b) {
		service.save(b);
		return"redirect:/Flora_Collection";
}
 @GetMapping("/My_Botanic_Space")
 public String getMyplants() {
	 return "MyBotanicSpace";
 }
 @RequestMapping("/mylist/{id}")
 public String getMylist(@PathVariable("id") int id) {
	 plants b=service.getPlantById(id);
	 MyBotanicList mb=new MyBotanicList(b.getPlant_Number(),b.getPlant_Name(),b.getPlant_Type(),b.getPrice());
	 myplantsService.saveMyBotanicList(mb);
	 return "redirect:/My_Botanic_Space";
 }
 }