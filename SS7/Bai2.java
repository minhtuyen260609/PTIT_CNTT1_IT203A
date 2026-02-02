
public class Bai2{
    static class Student{
        String ten;
        Student(String ten){
            this.ten=ten;
        }
    }
    public static void main(String[]args){
        int a=10;
        int b=a;
        b=20;
        System.out.println("a="+a);
        System.out.println("b="+b);

        Student s1=new Student("An");
        Student s2=s1;
        s2.ten="Binh";
        System.out.println("s1.ten="+s1.ten);
        System.out.println("s2.ten="+s2.ten);
    }
}
