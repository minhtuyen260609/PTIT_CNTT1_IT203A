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
    public void fetch(){
        System.out.println("Cho di nhat bong");
    }
}

public class {
    public static void main(String[]args){
        Animal animal=new Dog();
        animal.sound();

        if(animal instanceof Dog){
            Dog d=(Dog)animal;
            d.fetch();
        }
    }
}
