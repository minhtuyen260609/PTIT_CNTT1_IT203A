class Person{
    protected String name;
    protected int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Ho ten: "+name);
        System.out.println("Tuoi: "+age);
    }
}

class Student extends Person{
    private String studentId;
    private double gpa;
    public Student(String name,int age,String studentId,double gpa){
        super(name,age);
        this.studentId=studentId;
        this.gpa=gpa;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Ma SV: "+studentId);
        System.out.println("Diem TB: "+gpa);
    }
}

public class Bai1{
    public static void main(String[]args){
        Student s=new Student("Nguyen Van A",20,"SV001",8.5);
        s.display();
    }
}
