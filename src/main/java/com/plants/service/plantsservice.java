package com.plants.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plants.entity.plants;
import com.plants.repository.plantsreporsitory;

@Service
public class plantsservice {
	
	@Autowired
	private plantsreporsitory bRepo;
	public void save(plants b) {
		bRepo.save(b);
}
	public List<plants> getAllplants(){
     return bRepo.findAll();
}
	 public plants getPlantById(int Plant_Number) {
		 return bRepo.findById(Plant_Number).get();
	 }
}