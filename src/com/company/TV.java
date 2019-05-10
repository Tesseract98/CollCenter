package com.company;

public class TV implements Service{

    private double price;
    private String name;
    private Street regionName;
    private String technologyName;
    private int chanel;

    public TV(){

    }

    public TV(double price, String name, Street regionName, String technologyName, int chanel){
        this.price = price;
        this.name = name;
        this.regionName = regionName;
        this.technologyName = technologyName;
        this.chanel = chanel;
    }

    @Override
    public String toString() {
        return price + " " + name + " " + technologyName + " " + chanel;
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

    public void setChanel(int chanel) {
        this.chanel = chanel;
    }
}
