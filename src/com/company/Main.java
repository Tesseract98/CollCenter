package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws StreetException {
        List<Internet> internet = new ArrayList<>();
        List<Phone> phone = new ArrayList<>();
        List<TV> tv = new ArrayList<>();
        try {
            String[] internetStr = FileConverter.read("src\\com\\company\\InternetKind.txt").split(" ");
            String[] tvStr = FileConverter.read("src\\com\\company\\TvKind").split(" ");
            String[] phoneStr = FileConverter.read("src\\com\\company\\PhoneKind").split(" ");
            for(int i = 0; i < internetStr.length; i += 6) {
                internet.add(new Internet(Double.parseDouble(internetStr[i]), internetStr[i + 1],
                        Street.valueOf(internetStr[i + 2]), internetStr[i + 3], Integer.parseInt(internetStr[i + 4]),
                        Integer.parseInt(internetStr[i + 5])));
            }
            for(int i = 0; i < tvStr.length; i += 5) {
                phone.add(new Phone(Double.parseDouble(tvStr[i]), tvStr[i + 1],
                        Street.valueOf(tvStr[i + 2]), tvStr[i + 3], Integer.parseInt(tvStr[i + 4])));
            }
            for(int i = 0; i < phoneStr.length; i += 5) {
                tv.add(new TV(Double.parseDouble(phoneStr[i]), phoneStr[i + 1],
                        Street.valueOf(phoneStr[i + 2]), phoneStr[i + 3], Integer.parseInt(phoneStr[i + 4])));
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        ArrayList<Customer> allCustomers = new ArrayList<>(3);
        for (int i = 0; i < 1; i++){
            String name;
            String street = "";
            int numberFlat;
            int numberHome;
            boolean debt = false;
            Category category = null;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите фамилию и имя");
            name = scanner.nextLine();
            System.out.println("Введите улицу \n 1)BIGHORN \n 2)YELK \n 3)SOSNOVAYA");
            switch (scanner.nextInt()) {
                case 1:
                    street = "BIGHORN";
                    break;
                case 2:
                    street = "YELK";
                    break;
                case 3:
                    street = "SOSNOVAYA";
                    break;
            }
            System.out.println("Введите номер квартиры");
            numberFlat = scanner.nextInt();
            System.out.println("Введите номер дома");
            numberHome = scanner.nextInt();
            System.out.println("Введите есть ли задолженность \n 1)есть \n 2)нет");
            switch (scanner.nextInt()) {
                case 1:
                    debt = true;
                    break;
                case 2:
                    debt = false;
                    break;
            }
            System.out.println("Введите \n 1)частное лицо \n 2)юридическое дицо");
            switch (scanner.nextInt()) {
                case 1:
                    category = Category.PERSONAL;
                    break;
                case 2:
                    category = Category.BUSINESS;
                    break;
            }
            CheckCustomer checkCustomer = new CheckCustomer (name, street, numberFlat, numberHome, debt, category);
            if(checkCustomer.isFlagFit()){
                allCustomers.add(checkCustomer);
            }
        }

        for(Customer customer : allCustomers) {
            Street varStreet = customer.getAdress().getStreet();
            System.out.println(customer.name + " вам подходят следующие тарифы:");
            for(Internet intern : internet){
                if(intern.getRegionName() == varStreet){
                    System.out.println("Internet");
                    Discount.setPrice(intern, 15, 1);
                    System.out.println(intern.toString());
                }
            }
            for (TV tv1 : tv){
                if(tv1.getRegionName() == varStreet){
                    System.out.println("TV");
                    Discount.setPrice(tv1, 15, 1);
                    System.out.println(tv1.toString());
                }
            }
            for (Phone ph : phone){
                if(ph.getRegionName() == varStreet){
                    System.out.println("Phone");
                    Discount.setPrice(ph, 15, 1);
                    System.out.println(ph.toString());
                }
            }
        }
    }
}
