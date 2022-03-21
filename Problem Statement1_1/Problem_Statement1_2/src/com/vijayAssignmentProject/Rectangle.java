package com.vijayAssignmentProject;

import java.util.Scanner;



public class Rectangle {
	int length; 
    int breadth; 
    int area; 
   
    public Rectangle()
    {
    	length = 0;
    	breadth= 0;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = in.nextInt();
    }

    void calculate() {
        area = length * breadth;
        
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
       
    }

    public static void main(String args[]) {
        Rectangle rect1= new Rectangle();
        rect1.input();
        rect1.calculate();
        rect1.display();
        System.out.println("");
        Rectangle rect2 = new Rectangle();
        rect2.input();
        rect2.calculate();
        rect2.display();
        System.out.println("");
        Rectangle rect3 = new Rectangle();
        rect3.input();
        rect3.calculate();
        rect3.display();
        System.out.println("");
        Rectangle rect4 = new Rectangle();
        rect4.input();
        rect4.calculate();
        rect4.display();
        System.out.println("");
        Rectangle rect5 = new Rectangle();
        rect5.input();
        rect5.calculate();
        rect5.display();
    }
}






