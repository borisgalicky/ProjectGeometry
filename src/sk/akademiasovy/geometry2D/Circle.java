package sk.akademiasovy.geometry2D;

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
        double area=(r*r)*Math.PI;
        return area;
    }

    public double getPerimeter(){
        double perimeter=2*r*Math.PI;
        return perimeter;
    }
}
