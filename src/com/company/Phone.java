package com.company;

public class Phone implements Service{

    private double price;
    private Street regionName;
    private String technologyName;
    private String name;
    private int limitationInternet;

    public Phone(){

    }

    public Phone(double price, String name, Street regionName, String technologyName, int limitationInternet){
        this.price = price;
        this.name = name;
        this.regionName = regionName;
        this.technologyName = technologyName;
        this.limitationInternet = limitationInternet;
    }

    public Street getRegionName() {
        return regionName;
    }

    @Override
    public String toString() {
        return price + " " + name + " " + technologyName + " " + limitationInternet;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setName(String name) {
        name = name;
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

    public void setLimitationInternet(int limitationInternet) {
        this.limitationInternet = limitationInternet;
    }
}
