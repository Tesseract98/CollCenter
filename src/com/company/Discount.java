package com.company;

import static java.lang.Math.abs;

public class Discount{

    static public void setPrice(Service service, int prcent, int who) {
        switch (who){
            case 1:
                service.setPrice(service.getPrice() - service.getPrice() * abs(prcent - 5) / 100);
                break;
            case 2:
                service.setPrice(service.getPrice() - service.getPrice() * prcent / 100);
                break;
            default:
                service.setPrice(service.getPrice() - service.getPrice() * prcent / 100);
        }
    }
}
