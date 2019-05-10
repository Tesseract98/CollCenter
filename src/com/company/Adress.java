package com.company;

public class Adress {
    private Street street;
    private int numberHome;
    private int numberFlat;

    public Adress(String street, int numberFlat, int numberHome) throws StreetException {
        try {
            this.street = Street.valueOf(street);
        }
        catch (Exception exp){
            throw new StreetException("улица не входит в зону покрытия");
        }
        this.numberFlat = numberFlat;
        this.numberHome = numberHome;
    }

    public Street getStreet() {
        return street;
    }
}
