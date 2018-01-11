package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Rectangle;
import sk.akademiasovy.geometry.Square;

public class Main {
    public static void main(String[] args) {
    Square square1 = new Square(7.5);
    Square square2 = new Square();
    System.out.println("Area of first square is "+square1.getArea()+"\nPerimeter of first sqaure is "+ square1.getPerimeter()+"\nDiagonal in first square is "+square1.getDiagonal());

    Rectangle rectangle1 = new Rectangle();
    System.out.println("Area of first square is "+rectangle1.getArea()+"\nPerimeter of first sqaure is "+ rectangle1.getPerimeter());
    }
}
