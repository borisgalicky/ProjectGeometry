package sk.akademiasovy.geometry;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double value){
        side=value;
    }

    public Square() {
        side=0;
    }

    public double getArea(){
        return side*side;
    }

    public double getPerimeter(){
        return 4*side;
    }

    public double getDiagonal(){
        return side*Math.sqrt(2);
    }
}
