package com.company;

public class CheckCustomer extends Customer {
    private boolean flagFit = true;

    public CheckCustomer(String name, String street, int numberFlat, int numberHome, boolean debt, Category category) throws StreetException {

        try {
            super.adress = new Adress(street, numberFlat, numberHome);
        }
        catch (Exception exc){
            System.out.println("Извините, но " + exc.getMessage());
            flagFit = false;
        }
        if(debt){
            flagFit = false;
            System.out.println("Извините, но ваша кредитная история очень плоха");
        }
        super.debt = debt;
        super.category = category;
        super.name = name;
    }

    public boolean isFlagFit() {
        return flagFit;
    }
}
