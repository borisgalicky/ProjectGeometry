package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Circle;
import sk.akademiasovy.geometry.Rectangle;
import sk.akademiasovy.geometry.Square;
import sk.akademiasovy.geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(7.5);
        System.out.println("SIDE OF SQUARE: "+square1.getSide());
        System.out.println("Area of square is "+square1.getArea());
        System.out.println("Perimeter of square is "+ square1.getPerimeter());
        System.out.println("Diagonal in square is "+square1.getDiagonal());
        System.out.println("\n");

        Rectangle rectangle1 = new Rectangle(5,4);
        System.out.println("SIDES OF RECTANGLE: "+rectangle1.getA()+", "+rectangle1.getB());
        System.out.println("Area of rectangle is "+rectangle1.getArea());
        System.out.println("Perimeter of rectangle is "+ rectangle1.getPerimeter());
        System.out.println("\n");

        Triangle triangle1 = new Triangle(3,4,5);
        System.out.println("SIDES OF TRIANGLE: "+triangle1.getA()+", "+triangle1.getB()+", "+triangle1.getC());
        System.out.println("Is it triangle at all? "+triangle1.isTriangle());
        System.out.println("Area of triangle is "+triangle1.getArea());
        System.out.println("Perimeter of triangle is "+triangle1.getPerimeter());
        System.out.println("Is the triangle right angled? "+triangle1.isRectangular());
        System.out.println("Is triangle straight sided? "+triangle1.isStraightSided());
        System.out.println("Is triangle isosceles? "+triangle1.isIsosceles());
        System.out.println("\n");

        Circle circle1 = new Circle(5);
        System.out.println("RADIUS OF CIRCLE: "+circle1.getR());
        System.out.println("Area of circle is "+circle1.getArea());
        System.out.println("Perimeter of circle is "+circle1.getPerimeter());
        System.out.println("\n");
    }
}
