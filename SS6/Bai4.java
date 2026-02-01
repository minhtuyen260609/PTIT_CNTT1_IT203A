class Employee{
    String maNV;
    String tenNV;
    double luong;
    Employee(){
        maNV="Chua co";
        tenNV="Chua co";
        luong=0;
    }
    Employee(String maNV,String tenNV){
        this.maNV=maNV;
        this.tenNV=tenNV;
        luong=0;
    }
    Employee(String maNV,String tenNV,double luong){
        this.maNV=maNV;
        this.tenNV=tenNV;
        this.luong=luong;
    }
    void hienThi(){
        System.out.println("Ma NV: "+maNV);
        System.out.println("Ten NV: "+tenNV);
        System.out.println("Luong: "+luong);
        System.out.println();
    }
}
public class Bai4{
    public static void main(String[] args){
        Employee e1=new Employee();
        Employee e2=new Employee("NV01","Nguyen Van A");
        Employee e3=new Employee("NV02","Tran Thi B",15000000);
        e1.hienThi();
        e2.hienThi();
        e3.hienThi();
    }
}
