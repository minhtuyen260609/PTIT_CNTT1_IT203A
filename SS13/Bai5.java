import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Patient{
    private String id;
    private String fullName;
    private int age;
    private String diagnosis;
    public Patient(String id,String fullName,int age,String diagnosis){
        this.id=id;
        this.fullName=fullName;
        this.age=age;
        this.diagnosis=diagnosis;
    }
    public String getId(){return id;}
    public String getFullName(){return fullName;}
    public int getAge(){return age;}
    public String getDiagnosis(){return diagnosis;}
    public void setDiagnosis(String diagnosis){this.diagnosis=diagnosis;}
    public String toString(){
        return "ID: "+id+" | FullName: "+fullName+" | Age: "+age+" | Diagnosis: "+diagnosis;
    }
}

public class Bai5{
    static ArrayList<Patient> list=new ArrayList<>();

    public static Patient findById(String id){
        for(Patient p:list){
            if(p.getId().equals(id)) return p;
        }
        return null;
    }

    public static void showMenu(){
        System.out.println("============ MENU ============");
        System.out.println("1. Tiếp nhận bệnh nhân");
        System.out.println("2. Cập nhật chẩn đoán");
        System.out.println("3. Xuất viện");
        System.out.println("4. Sắp xếp danh sách bệnh nhân");
        System.out.println("5. Hiển thị danh sách bệnh nhân");
        System.out.println("6. Thoát");
        System.out.println("===============================");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            showMenu();
            System.out.print("Chọn chức năng: ");
            int choice=Integer.parseInt(sc.nextLine());
            if(choice==1){
                System.out.print("Nhập ID bệnh nhân: ");
                String id=sc.nextLine();
                if(findById(id)!=null){
                    System.out.println("ID đã tồn tại.");
                    continue;
                }
                System.out.print("Nhập tên bệnh nhân: ");
                String name=sc.nextLine();
                System.out.print("Nhập tuổi: ");
                int age=Integer.parseInt(sc.nextLine());
                System.out.print("Nhập chẩn đoán: ");
                String d=sc.nextLine();
                list.add(new Patient(id,name,age,d));
                System.out.println("Bệnh nhân đã được thêm thành công.");
            }
            else if(choice==2){
                System.out.print("Nhập ID bệnh nhân: ");
                String id=sc.nextLine();
                Patient p=findById(id);
                if(p==null){
                    System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
                }else{
                    System.out.print("Nhập chẩn đoán mới: ");
                    String d=sc.nextLine();
                    p.setDiagnosis(d);
                    System.out.println("Chẩn đoán đã được cập nhật.");
                }
            }
            else if(choice==3){
                System.out.print("Nhập ID bệnh nhân để xuất viện: ");
                String id=sc.nextLine();
                Patient p=findById(id);
                if(p==null){
                    System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
                }else{
                    list.remove(p);
                    System.out.println("Bệnh nhân đã được xuất viện.");
                }
            }
            else if(choice==4){
                list.sort(new Comparator<Patient>(){
                    public int compare(Patient a,Patient b){
                        if(b.getAge()!=a.getAge()) return b.getAge()-a.getAge();
                        return a.getFullName().compareToIgnoreCase(b.getFullName());
                    }
                });
                System.out.println("Danh sách bệnh nhân sau khi sắp xếp:");
                for(Patient p:list){
                    System.out.println(p);
                }
            }
            else if(choice==5){
                System.out.println("Danh sách bệnh nhân đang theo dõi:");
                for(Patient p:list){
                    System.out.println(p);
                }
            }
            else if(choice==6){
                System.out.println("Thoát chương trình.");
                break;
            }
        }
    }
}