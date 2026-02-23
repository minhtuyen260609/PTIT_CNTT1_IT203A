public class Bai5{
    static abstract class Employee{
        protected String name;
        protected double baseSalary;
        public Employee(String name,double baseSalary){
            this.name=name;
            this.baseSalary=baseSalary;
        }
        public abstract double calculateSalary();
    }
    interface BonusCalculator{
        double getBonus();
    }
    static class OfficeStaff extends Employee{
        public OfficeStaff(String name,double baseSalary){
            super(name,baseSalary);
        }
        public double calculateSalary(){
            return baseSalary;
        }
    }
    static class Manager extends Employee implements BonusCalculator{
        private double kpiBonus;
        public Manager(String name,double baseSalary,double kpiBonus){
            super(name,baseSalary);
            this.kpiBonus=kpiBonus;
        }
        public double getBonus(){
            return kpiBonus;
        }
        public double calculateSalary(){
            return baseSalary+getBonus();
        }
    }
    public static void main(String[]args){
        Employee e1=new OfficeStaff("Nhan vien A",8000000);
        Employee e2=new Manager("Quan ly B",15000000,5000000);
        printSalary(e1);
        printSalary(e2);
    }
    public static void printSalary(Employee e){
        System.out.println("Ten: "+e.name);
        System.out.println("Luong co ban: "+e.baseSalary);
        if(e instanceof BonusCalculator){
            double bonus=((BonusCalculator)e).getBonus();
            System.out.println("Thuong KPI: "+bonus);
        }else{
            System.out.println("Thuong KPI: Khong co");
        }
        System.out.println("Tong luong: "+e.calculateSalary());
        System.out.println("------------------------");
    }
}