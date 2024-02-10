package com.plants.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plants.entity.MyBotanicList;
import com.plants.repository.Myplantrepository;

@Service
public class MyBotanicListservice {
	@Autowired
    private Myplantrepository myplants;
	
	

	public void saveMyBotanicList(MyBotanicList mb) {
		myplants.save(mb);
		
	}
  }