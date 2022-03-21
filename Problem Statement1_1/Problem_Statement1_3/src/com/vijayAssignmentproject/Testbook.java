package com.vijayAssignmentproject;

import java.util.Scanner;


public class Testbook {
	public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter the Book name:");
        String bookname=scan.nextLine();
        
        System.out.println("Enter the price:");
        int price=scan.nextInt();
        scan.nextLine();
        
        
        Book b=new Book();
        b.setBookName(bookname);
        b.setBookPrice(price);
        System.out.println("Book Details");
        System.out.println("Book Name :"+b.getBookName());
        System.out.println("Book Price :"+b.getBookPrice());
       
    }
}







