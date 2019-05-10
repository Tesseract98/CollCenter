package com.company;

public class Internet implements Service{

    private String name;
    private double price;
    private double speed;
    private Street regionName;
    private String technologyName;
    private int limitationVolume;

    public Internet(){

    }

    public Internet(double price, String name, Street regionName, String technologyName, int limitationVolume, double speed){
        this.price = price;
        this.name = name;
        this.regionName = regionName;
        this.technologyName = technologyName;
        this.limitationVolume = limitationVolume;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return price + " " + name + " " + technologyName + " " + limitationVolume + " " + speed;
    }

    public Street getRegionName() {
        return regionName;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setRegionName(Street regionName) {
        this.regionName = regionName;
    }

    @Override
    public void setTechnology(String technologyName) {
        this.technologyName = technologyName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setLimitationVolume(int limitationVolume) {
        this.limitationVolume = limitationVolume;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
