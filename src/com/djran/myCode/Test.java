package com.djran.myCode;

public class Test {
    public static void main(String[] args)  {
    	//--shape constructor circle constructor
    	Shape shape ;
    	shape= new Circle();
        //shape
        System.out.println(shape.name);
        //this is circle
        shape.printType();
        //shape
        shape.printName();
    }
}
 
class Shape {
    public String name = "shape";
     
    public Shape(){
        System.out.println("shape constructor");
    }
     
    public void printType() {
        System.out.println("this is shape");
    }
     
    public static void printName() {
        System.out.println("shape");
    }
}
 
class Circle extends Shape {
    public String name = "circle";
     
    public Circle() {
        System.out.println("circle constructor");
    }
     
    public void printType() {
        System.out.println("this is circle");
    }
     
    public static void printName() {
        System.out.println("circle");
    }
}
