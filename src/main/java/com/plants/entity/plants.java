package com.plants.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class plants {
   @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int Plant_Number;
   private String Plant_Name;
   private String Plant_Type;
   private String Price;
public plants(int plant_Number, String plant_Name, String plant_Type, String price) {
	super();
	Plant_Number=0;
	Plant_Name=plant_Name;
	Plant_Type=plant_Type;
	Price=price;
}
public plants() {
	super();
	// TODO Auto-generated constructor stub
}
public int getPlant_Number() {
	return Plant_Number;
}
public void setPlant_Number(int plant_Number) {
	Plant_Number = plant_Number;
}
public String getPlant_Name() {
	return Plant_Name;
}
public void setPlant_Name(String plant_Name) {
	Plant_Name = plant_Name;
}
public String getPlant_Type() {
	return Plant_Type;
}
public void setPlant_Type(String plant_Type) {
	Plant_Type = plant_Type;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	Price = price;
}
}
