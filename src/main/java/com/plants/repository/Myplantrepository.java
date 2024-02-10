package com.plants.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plants.entity.MyBotanicList;
@Repository
public interface Myplantrepository extends JpaRepository<MyBotanicList,Integer> {

}
