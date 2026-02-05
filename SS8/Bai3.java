class Employee{
    protected String name;
    protected double salary;
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Ten: "+name);
        System.out.println("Luong co ban: "+salary);
    }
}

class Manager extends Employee{
    private String department;
    public Manager(String name,double salary,String department){
        super(name,salary);
        this.department=department;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Phong ban: "+department);
    }
}

public class Bai3{
    public static void main(String[]args){
        Manager m=new Manager("Tran Van B",15000000,"IT");
        m.display();
    }
}
