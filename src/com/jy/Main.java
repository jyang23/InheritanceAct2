package com.jy;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Book Code: ");
        String code = in.nextLine();

        Product p = new Product();
        //System.out.println(p.toString());


        Book b = new Book();
        b.setCode(code);
        b.setAuthor("Hello");
        b.setPrice(60.57);
        b.setDescription("Sample Book");
        b.setPages(20);
        b.setQuantity(10);
        b.setInStock(false);
        System.out.println(b);

//        Book c = new Book();
//        c.setCode(code);
//        c.setAuthor("Goodbye");
//        c.setPrice(60.57);
//        c.setDescription("Another Sample Book");
//        c.setPages(20);
//        //System.out.println(b.toString());
//
//        Book d = new Book();
//        d.setCode(code);
//        d.setAuthor("Hello");
//        d.setPrice(60.57);
//        d.setDescription("Sample Book");
//        d.setPages(20);
//        //System.out.println(d.toString());


//        if(b.equals(c))
//        {
//            System.out.println("books b and c are the same");
//        }
//        else
//        {
//            System.out.println("books b and c are not the same");
//
//        }
//
//        if(b.equals(d))
//        {
//            System.out.println("books b and d are the same");
//        }
//        else
//        {
//            System.out.println("books b and d are not the same");
//        }


        System.out.println("Next Book Code: ");
        code = in.nextLine();

        Software s = new Software();
        s.setCode(code);
        s.setOs("MACOS");
        s.setPrice(90.53);
        s.setDescription("Mac for beginners");
        s.setPlatform("Mac");
        s.setProgrammer("java");
        //System.out.println(s.toString());

    }
}
