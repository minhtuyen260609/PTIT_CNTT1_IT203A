public class Bai4{
    public static void main(String[]args){
        ClassRoom s1=new ClassRoom("An");
        ClassRoom s2=new ClassRoom("Binh");
        ClassRoom s3=new ClassRoom("Cuong");
        s1.dongTien(100000);
        s2.dongTien(200000);
        s3.dongTien(150000);
        ClassRoom.xemQuyLop();
    }
}
class ClassRoom{
    String tenSV;
    static int classFund=0;
    ClassRoom(String tenSV){
        this.tenSV=tenSV;
    }
    void dongTien(int soTien){
        classFund+=soTien;
        System.out.println(tenSV+" dong "+soTien);
    }
    static void xemQuyLop(){
        System.out.println("Tong quy lop:"+classFund);
    }
}
