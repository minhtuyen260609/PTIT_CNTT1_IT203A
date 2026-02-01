class Student{
    String maSV;
    String hoTen;
    int namSinh;
    double diemTB;
    Student(String maSV,String hoTen,int namSinh,double diemTB){
        this.maSV=maSV;
        this.hoTen=hoTen;
        this.namSinh=namSinh;
        this.diemTB=diemTB;
    }
    void hienThi(){
        System.out.println("Ma SV: "+maSV);
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Nam sinh: "+namSinh);
        System.out.println("Diem TB: "+diemTB);
        System.out.println();
    }
}
public class Bai1{
    public static void main(String[] args){
        Student sv1=new Student("SV01","Nguyen Van A",2004,8.5);
        Student sv2=new Student("SV02","Tran Thi B",2005,7.8);
        sv1.hienThi();
        sv2.hienThi();
    }
}
