package com.plants.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plants.entity.plants;
@Repository
public interface plantsreporsitory extends JpaRepository<plants,Integer> {
}