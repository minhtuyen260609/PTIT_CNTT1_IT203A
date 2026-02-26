import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Medicine{
    private String drugId;
    private String drugName;
    private double unitPrice;
    private int quantity;
    public Medicine(String drugId,String drugName,double unitPrice,int quantity){
        this.drugId=drugId;
        this.drugName=drugName;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }
    public String getDrugId(){return drugId;}
    public String getDrugName(){return drugName;}
    public double getUnitPrice(){return unitPrice;}
    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){this.quantity=quantity;}
    public double getTotal(){return unitPrice*quantity;}
}

public class Bai6{
    static List<Medicine> cart=new ArrayList<>();

    public static Medicine findById(String id){
        for(Medicine m:cart){
            if(m.getDrugId().equals(id)) return m;
        }
        return null;
    }

    public static void menu(){
        System.out.println("============ MENU ============");
        System.out.println("1. Thêm thuốc vào đơn");
        System.out.println("2. Điều chỉnh số lượng");
        System.out.println("3. Xóa thuốc");
        System.out.println("4. In hóa đơn");
        System.out.println("5. Tìm thuốc giá rẻ");
        System.out.println("6. Thoát");
        System.out.println("===============================");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            menu();
            System.out.print("Chọn chức năng: ");
            int choice=Integer.parseInt(sc.nextLine());

            if(choice==1){
                System.out.print("Nhập mã thuốc: ");
                String id=sc.nextLine();
                System.out.print("Nhập tên thuốc: ");
                String name=sc.nextLine();
                System.out.print("Nhập đơn giá: ");
                double price=Double.parseDouble(sc.nextLine());
                System.out.print("Nhập số lượng: ");
                int qty=Integer.parseInt(sc.nextLine());
                Medicine m=findById(id);
                if(m!=null){
                    m.setQuantity(m.getQuantity()+qty);
                    System.out.println("Đã cộng dồn số lượng cho thuốc đã tồn tại.");
                }else{
                    cart.add(new Medicine(id,name,price,qty));
                    System.out.println("Thêm thuốc thành công.");
                }
            }

            else if(choice==2){
                while(true){
                    System.out.print("Nhập mã thuốc: ");
                    String id=sc.nextLine();
                    Medicine m=findById(id);
                    if(m==null){
                        System.out.println("Không tìm thấy thuốc trong đơn.");
                    }else{
                        System.out.print("Nhập số lượng mới: ");
                        int qty=Integer.parseInt(sc.nextLine());
                        if(qty==0){
                            cart.remove(m);
                            System.out.println("Thuốc đã được xóa do số lượng = 0.");
                        }else{
                            m.setQuantity(qty);
                            System.out.println("Cập nhật số lượng thành công.");
                        }
                        break;
                    }
                }
            }

            else if(choice==3){
                System.out.print("Nhập mã thuốc cần xóa: ");
                String id=sc.nextLine();
                Medicine m=findById(id);
                if(m==null){
                    System.out.println("Mã thuốc không tồn tại.");
                }else{
                    cart.remove(m);
                    System.out.println("Xóa thuốc thành công.");
                }
            }

            else if(choice==4){
                if(cart.isEmpty()){
                    System.out.println("Đơn thuốc trống.");
                    continue;
                }
                double total=0;
                System.out.println("Mã Thuốc | Tên Thuốc | Đơn Giá | Số Lượng | Thành Tiền");
                for(Medicine m:cart){
                    System.out.printf("%s | %s | %.0f | %d | %.0f\n",
                            m.getDrugId(),m.getDrugName(),m.getUnitPrice(),m.getQuantity(),m.getTotal());
                    total+=m.getTotal();
                }
                System.out.println("Tổng tiền: "+(long)total+" VNĐ");
                cart.clear();
            }

            else if(choice==5){
                System.out.println("Thuốc giá rẻ (dưới 50000):");
                for(Medicine m:cart){
                    if(m.getUnitPrice()<50000){
                        System.out.printf("%s | %s | %.0f\n",
                                m.getDrugId(),m.getDrugName(),m.getUnitPrice());
                    }
                }
            }

            else if(choice==6){
                System.out.println("Thoát chương trình.");
                break;
            }
        }
    }
}