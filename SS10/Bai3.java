public class Bai3{
    static abstract class Animal{
        protected String name;
        public Animal(String name){this.name=name;}
    }
    interface Swimmable{
        void swim();
    }
    interface Flyable{
        void fly();
    }
    static class Duck extends Animal implements Swimmable,Flyable{
        public Duck(String name){super(name);}
        public void swim(){
            System.out.println(name+" dang boi");
        }
        public void fly(){
            System.out.println(name+" dang bay");
        }
    }
    static class Fish extends Animal implements Swimmable{
        public Fish(String name){super(name);}
        public void swim(){
            System.out.println(name+" dang boi");
        }
    }
    public static void main(String[]args){
        Duck d=new Duck("Vit");
        Fish f=new Fish("Ca");
        d.swim();
        d.fly();
        f.swim();
    }
}