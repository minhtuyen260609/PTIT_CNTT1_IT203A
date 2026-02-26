class Animals{
    public void sound(){
        System.out.println("Dong vat keu");
    }
}

class Dogs extends Animals{
    @Override
    public void sound(){
        System.out.println("Gau gau");
    }
    public void fetch(){
        System.out.println("Cho di nhat bong");
    }
}

public class Bai4{
    public static void main(String[]args){
        Animals animal=new Dog();
        animal.sound();

        if(animal instanceof Dogs){
            Dog d=(Dogs)animal;
            d.fetch();
        }
    }
}
