import java.io.*;
public abstract class Shape{
    private double length;
    private double breadth;

    public Shape(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public abstract double area();
    public abstract double circumference();

    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getBreadth() {
        return this.breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

}