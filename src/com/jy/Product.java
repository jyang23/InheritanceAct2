package com.jy;

import java.math.RoundingMode;
import java.text.NumberFormat;

public class Product{

    private String code;
    private String description;
    private double price;
    private int quantity;

    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
        quantity = 0;
        //System.out.println("A Product");
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return  "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n"+
                "Quantity:           " + quantity + "\n";
    }

    public boolean equals() {
        System.out.print("This is the equals method of the superclass!");
        return false;
    }

    private String getFormattedPrice(double price) {
        // Use the NumberFormat class to form  at the price to 2 decimal places
        NumberFormat number = NumberFormat.getInstance();
        number.setMaximumFractionDigits(2);
        number.setMinimumFractionDigits(2);
        number.setRoundingMode(RoundingMode.HALF_UP);
        return number.format(price);
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}