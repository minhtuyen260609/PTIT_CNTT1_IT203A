public class Bai1{
    static class Student{
        String maSV,tenSV;
        static int totalStudent=0;
        Student(String maSV,String tenSV){
            this.maSV=maSV;
            this.tenSV=tenSV;
            totalStudent++;
        }
        void hienThi(){
            System.out.println(maSV+" - "+tenSV);
        }
        static void hienThiTong(){
            System.out.println("Tong so sinh vien:"+totalStudent);
        }
    }
    public static void main(String[]args){
        Student s1=new Student("SV01","An");
        Student s2=new Student("SV02","Binh");
        Student s3=new Student("SV03","Cuong");
        s1.hienThi();
        s2.hienThi();
        s3.hienThi();
        Student.hienThiTong();
    }
}
