class Book{
    String maSach;
    String tenSach;
    double gia;
    Book(String maSach,String tenSach,double gia){
        this.maSach=maSach;
        this.tenSach=tenSach;
        this.gia=gia;
    }
    void hienThi(){
        System.out.println("Ma sach: "+maSach);
        System.out.println("Ten sach: "+tenSach);
        System.out.println("Gia: "+gia);
        System.out.println();
    }
}
public class Bai5{
    public static void main(String[] args){
        Book b=new Book("S01","Lap trinh Java",120000);
        b.hienThi();
    }
}
