package com.company;

public interface Service {
    void setPrice(double price);
    void setName(String name);
    void setRegionName(Street regionName);
    void setTechnology(String technologyName);
    double getPrice();
}
