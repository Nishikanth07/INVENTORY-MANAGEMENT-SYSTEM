package com.pre_scient.inventory_management.pojos;

import java.util.Scanner;

public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String postalCode;

    public Address() {
    	
    }
    
    public Address(String street, String city, String state, String country, String postalCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
    }

    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public void getAddressDetails() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("ENTER YOUR STREET");
    	setStreet(sc.nextLine());
    	System.out.println("ENTER YOUR CITY = ");
    	setCity(sc.nextLine());
    	System.out.println("ENTER YOUR STATE = ");
    	setState(sc.nextLine());
    	System.out.println("ENTER YOUR COUNTRY = ");
    	setCountry(sc.nextLine());
    	System.out.println("ENTER YOUR POSTAL CODE = ");
    	setPostalCode(sc.nextLine());
    	sc.close();
    }

    
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + ", " + country + " - " + postalCode;
    }
}


