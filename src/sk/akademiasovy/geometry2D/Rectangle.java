package sk.akademiasovy.geometry2D;

public class Rectangle {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Rectangle(double value1){
        a = value1;
        b = value1;
    }

    public Rectangle(double value1, double value2){
        a = value1;
        b = value2;
    }

    public Rectangle(){
        a=0;
        b=0;
    }

    public void transpose(){
        double temp;
        temp=a;
        a=b;
        b=temp;
    }

    public double getArea(){
        return a*b;
    }

    public double getPerimeter(){
        return (2*a)+(2*b);
    }
}