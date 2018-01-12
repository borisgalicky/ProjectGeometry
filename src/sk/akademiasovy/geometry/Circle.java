package sk.akademiasovy.geometry;

public class Circle {
    private double r;

    public double getR() {
        return r;
    }

    public Circle(double value){
        r=value;
    }

    public Circle(){
        r=0;
    }

    public double getArea(){
        double area=(r*r)*3.14159;
        return area;
    }

    public double getPerimeter(){
        double perimeter=2*r*3.14159;
        return perimeter;
    }
}
