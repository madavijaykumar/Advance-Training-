package com.vijayAssignment;
import java.util.Scanner;



public class Rectangle {
	float length; 
    float width; 
    float area; 
    float parameter;
    
    public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	
    public Rectangle()
    {
    	length = 1;
    	width= 1;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter width of rectangle: ");
        width = in.nextInt();
    }
    
    void  areaRectangle()
    {
        area = length * width;
       
    }
 
     void  perimeterRectangle()
    {
    	 parameter = 2*(length + width);
       
    }

    void display() {
    	if(length>0 && length<20)
        {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Parameter of Rectangle = " +parameter);}
       
        }

    public static void main(String args[]) {
    	
        Rectangle rect1 = new Rectangle();
        rect1.input();
        rect1.areaRectangle();
        rect1.perimeterRectangle();
        rect1.display();
        System.out.println("");
        
        Rectangle rect2 = new Rectangle();
        rect2.input();
        rect2.areaRectangle();
        rect2.perimeterRectangle();
        rect2.display();
        System.out.println("");
        
        Rectangle rect3 = new Rectangle();
        rect3.input();
        rect3.areaRectangle();
        rect3.perimeterRectangle();
        rect3.display();
        System.out.println("");
        
        Rectangle rect4 = new Rectangle();
        rect4.input();
        rect4.areaRectangle();
        rect4.perimeterRectangle();
        rect4.display();
        System.out.println("");
        
        Rectangle rect5 = new Rectangle();
        rect5.input();
        rect5.areaRectangle();
        rect5.perimeterRectangle();
        rect5.display();
    	
    }
}



	


