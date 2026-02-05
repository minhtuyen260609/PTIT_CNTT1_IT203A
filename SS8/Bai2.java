class Animal{
    public void sound(){
        System.out.println("Dong vat keu");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Gau gau");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meo meo");
    }
}

public class Bai2{
    public static void main(String[]args){
        Animal a1=new Dog();
        Animal a2=new Cat();
        a1.sound();
        a2.sound();
    }
}
