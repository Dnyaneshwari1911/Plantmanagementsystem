package com.plants.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MyBotanic")
public class MyBotanicList {
    @Id
    private int Plant_Number;
    private String Plant_Name;
    private String Plant_Type;
    private String Price;

    public MyBotanicList() {
        super();
    }

    public MyBotanicList(int Plant_Number, String Plant_Name, String Plant_Type, String Price){
        this.Plant_Number = Plant_Number;
        this.Plant_Name = Plant_Name;
        this.Plant_Type = Plant_Type;
        this.Price = Price;
    }

    public int getPlant_Number() {
        return Plant_Number;
    }

    public void setPlant_Number(int Plant_Number) {
        this.Plant_Number = Plant_Number;
    }

    public String getPlant_Name() {
        return Plant_Name;
    }

    public void setPlant_Name(String Plant_Name) {
        this.Plant_Name = Plant_Name;
    }

    public String getPlant_Type() {
        return Plant_Type;
    }

    public void setPlantType(String Plant_Type) {
        this.Plant_Type = Plant_Type;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }
}