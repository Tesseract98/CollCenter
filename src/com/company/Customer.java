package com.company;

public class Customer {
    protected String name;
    protected Adress adress;
    protected boolean debt;
    protected Category category;

    public Customer(String name, String street, int numberFlat, int numberHome, boolean debt, Category category) throws StreetException {
        this.adress = new Adress(street, numberFlat, numberHome);
        this.debt = debt;
        this.category = category;
        this.name = name;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public Adress getAdress() {
        return adress;
    }

    public boolean isDebt() {
        return debt;
    }

    public Category getCategory() {
        return category;
    }
}
