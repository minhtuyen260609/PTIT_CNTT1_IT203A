import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap tuoi cua ban: ");
        int age=sc.nextInt();
        System.out.print("Nhap so sach dang muon: ");
        int books=sc.nextInt();
        if(age>=18&&books<3){
            System.out.println("Ket qua: Ban DU DIEU KIEN muon sach quy hiem.");
        }else{
            System.out.println("Ket qua: Khong du dieu kien.");
            if(age<18){
                System.out.println("Ly do: Ban phai tu 18 tuoi tro len.");
            }else if(books>=3){
                System.out.println("Ly do: Ban da muon toi da 3 cuon.");
            }
        }
    }
}
