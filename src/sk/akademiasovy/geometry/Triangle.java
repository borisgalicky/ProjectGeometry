package sk.akademiasovy.geometry;

public class Triangle {
    private double a;
    private double b;
    private double c;


    public Triangle(double value1, double value2, double value3){
        a=value1;
        b=value2;
        c=value3;
    }

    public Triangle(){
        a=0;
        b=0;
        c=0;
    }

    public double getArea(){
    double s;
    s=(a+b+c)/2;
    double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return area;
    }

    public boolean isRectangular(){
        if ((c*c)==(a*a)+(b*b)){
            return true;
        }
        else if ((b*b)==(c*c)+(a*a)){
            return true;
        }
        else if ((a*a)==(b*b)+(c*c)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isRectangle(){
        if(c<(a+b)){
            return true;
        }
        else if(a<(a+c)){
            return true;
        }
        else if(b<(a+c)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isStraightSided(){
        if((a==b) && (b==c)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isIsosceles(){
        if((a==b) || (b==c) || (c==a)){
            return true;
        }
        else{
            return false;
        }
    }

    public double getPerimeter(){
        return a+b+c;
    }
}
