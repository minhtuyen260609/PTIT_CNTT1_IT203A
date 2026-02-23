public class Bai1{
    interface Shape{
        double getArea();
        double getPerimeter();
    }
    static class Circle implements Shape{
        private double radius;
        public Circle(double radius){this.radius=radius;}
        public double getArea(){return Math.PI*radius*radius;}
        public double getPerimeter(){return 2*Math.PI*radius;}
    }
    static class Rectangle implements Shape{
        private double width;
        private double height;
        public Rectangle(double width,double height){this.width=width;this.height=height;}
        public double getArea(){return width*height;}
        public double getPerimeter(){return 2*(width+height);}
    }
    public static void main(String[]args){
        Shape c=new Circle(5);
        Shape r=new Rectangle(4,6);
        System.out.println("Hinh tron:");
        System.out.println("Dien tich: "+c.getArea());
        System.out.println("Chu vi: "+c.getPerimeter());
        System.out.println("Hinh chu nhat:");
        System.out.println("Dien tich: "+r.getArea());
        System.out.println("Chu vi: "+r.getPerimeter());
    }
}