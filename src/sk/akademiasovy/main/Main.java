package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Rectangle;
import sk.akademiasovy.geometry.Square;
import sk.akademiasovy.geometry.Triangle;

public class Main {
    public static void main(String[] args) {
    Square square1 = new Square(7.5);
        System.out.println("Area of first square is "+square1.getArea());
        System.out.println("Perimeter of first square is "+ square1.getPerimeter());
        System.out.println("Diagonal in first square is "+square1.getDiagonal());
        System.out.println("\n");

    Rectangle rectangle1 = new Rectangle(5,4);
        System.out.println("Area of first rectangle is "+rectangle1.getArea());
        System.out.println("Perimeter of first rectangle is "+ rectangle1.getPerimeter());
        System.out.println("\n");

    Triangle triangle1= new Triangle(5,6,7);
        System.out.println("Is it triangle? "+triangle1.isRectangle());
        System.out.println("Area of first triangle is "+triangle1.getArea());
        System.out.println("Perimeter of first triangle is "+triangle1.getPerimeter());
        System.out.println("Is the first triangle right angled? "+triangle1.isRectangular());
        System.out.println("Is straight sided? "+triangle1.isStraightSided());
        System.out.println("Is isosceles? "+triangle1.isIsosceles());
        System.out.println("\n");
    }
}
