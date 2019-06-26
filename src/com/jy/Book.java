package com.jy;

public class Book extends Product {

    private String author;
    private int pages;

    public Book(){
        super();
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
}