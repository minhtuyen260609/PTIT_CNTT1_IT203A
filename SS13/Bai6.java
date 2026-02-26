import java.util.*;

abstract class Shape{
    public abstract double calculateArea();
}

class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(double side){
        this.width=side;
        this.height=side;
    }
    @Override
    public double calculateArea(){
        return width*height;
    }
}

public class Bai6{
    public static void main(String[]args){
        List<Shape>shapes=new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3,4));
        shapes.add(new Rectangle(6));
        double total=0;
        int i=1;
        for(Shape s:shapes){
            double area=s.calculateArea();
            System.out.println(i+". Dien tich: "+Math.round(area*100.0)/100.0);
            total+=area;
            i++;
        }
        System.out.println("=> Tong dien tich: "+Math.round(total*100.0)/100.0);
    }
}
