public class Bai2 {
    static abstract class Vehicle{
        protected String brand;
        public Vehicle(String brand){this.brand=brand;}
        public abstract void move();
    }
    static class Car extends Vehicle{
        public Car(String brand){super(brand);}
        public void move(){
            System.out.println(brand+" - Cach di chuyen: Di chuyen bang dong co");
        }
    }
    static class Bicycle extends Vehicle{
        public Bicycle(String brand){super(brand);}
        public void move(){
            System.out.println(brand+" - Cach di chuyen: Di chuyen bang suc nguoi");
        }
    }
    public static void main(String[]args){
        Vehicle v1=new Car("Toyota");
        Vehicle v2=new Bicycle("Giant");
        v1.move();
        v2.move();
    }
}
