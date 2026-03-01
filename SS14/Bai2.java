import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        HashMap<String, String> drugMap = new HashMap<>();

        drugMap.put("T01", "Paracetamol");
        drugMap.put("T02", "Ibuprofen");
        drugMap.put("T03", "Amoxicillin");
        drugMap.put("T04", "Vitamin C");
        drugMap.put("T05", "Aspirin");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String code = sc.nextLine();

        if(drugMap.containsKey(code)){
            System.out.println("Tên thuốc: " + drugMap.get(code));
        } else {
            System.out.println("Thuốc không tồn tại.");
        }
    }
}