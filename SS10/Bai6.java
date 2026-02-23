import java.util.*;
public class Bai6{
    static class Product{
        String name;
        double price;
        public Product(String name,double price){
            this.name=name;
            this.price=price;
        }
        public String toString(){
            return name+" - "+price;
        }
    }
    public static void main(String[]args){
        List<Product> list=new ArrayList<>();
        list.add(new Product("Laptop",1500));
        list.add(new Product("Mouse",20));
        list.add(new Product("Keyboard",50));
        list.add(new Product("Monitor",300));
        Collections.sort(list,new Comparator<Product>(){
            public int compare(Product p1,Product p2){
                return Double.compare(p1.price,p2.price);
            }
        });
        System.out.println("Sap xep theo gia tang dan (Anonymous Class):");
        for(Product p:list)System.out.println(p);
        Collections.sort(list,(p1,p2)->p1.name.compareTo(p2.name));
        System.out.println("Sap xep theo ten A-Z (Lambda):");
        for(Product p:list)System.out.println(p);
/*
Lambda chi dung duoc khi interface la Functional Interface (chi co 1 abstract method).
Anonymous Class bat buoc dung khi:
- Can them thuoc tinh rieng ben trong.
- Can override nhieu method.
- Can logic phuc tap hoac khoi tao rieng.
*/
    }
}