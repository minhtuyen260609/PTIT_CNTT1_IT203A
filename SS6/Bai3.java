class Product{
    private String maSP;
    private String tenSP;
    private double giaBan;
    Product(String maSP,String tenSP,double giaBan){
        this.maSP=maSP;
        this.tenSP=tenSP;
        setGiaBan(giaBan);
    }
    String getMaSP(){
        return maSP;
    }
    String getTenSP(){
        return tenSP;
    }
    double getGiaBan(){
        return giaBan;
    }
    void setGiaBan(double giaBan){
        if(giaBan>0)this.giaBan=giaBan;
        else System.out.println("Gia khong hop le");
    }
    void hienThi(){
        System.out.println("Ma SP: "+maSP);
        System.out.println("Ten SP: "+tenSP);
        System.out.println("Gia ban: "+giaBan);
        System.out.println();
    }
}
public class Bai3{
    public static void main(String[] args){
        Product p=new Product("SP01","But bi",5000);
        p.hienThi();
        p.setGiaBan(-2000);
        p.hienThi();
    }
}
