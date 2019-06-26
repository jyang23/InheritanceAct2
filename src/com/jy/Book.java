package com.jy;

public class Book extends Product {

    private String author;
    private int pages;
    private double price;
    private int quantity;

    public Book(){
        //super();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.print("This is the equals method of the subclass Book!");
        if(this == obj)
        {
            return true;
        }
        else
            {
            return false;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double total()
    {
        double total;
        total = getQuantity()*getPrice();
        return total;
    }

    @Override
    public String toString() {
        return  "Book Title:             " + getDescription() + "\n"+
                "Code:                   " + getCode() + "\n"+
                "Author:                 " + author + "\n"+
                "Pages:                  " + pages + "\n"+
                "Price:                  " + getPrice() + "\n"+
                "Quantity:               " + quantity + "\n"+
                "Total Price:            " + total() + "\n";
    }
}