import java.util.Scanner;

class Rectangle implements IShape{
    private double length;
    private double width;



    public Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }


    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }
}

class Entry {
    public static void main(String[]args) {


    }
}