import java.util.*;

class Patient {
    String name;
    int age;
    String department;

    public Patient(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (" + age + " tuổi)";
    }
}

public class Bai6 {

    public static void main(String[] args) {

        List<Patient> patients = Arrays.asList(
                new Patient("Lan", 30, "Tim mạch"),
                new Patient("Hùng", 45, "Nội tiết"),
                new Patient("Mai", 28, "Tim mạch")
        );

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        // Gom nhóm theo khoa
        for (Patient p : patients) {
            if (!departmentMap.containsKey(p.department)) {
                departmentMap.put(p.department, new ArrayList<>());
            }
            departmentMap.get(p.department).add(p);
        }

        // In cấu trúc Map
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            System.out.println("Khoa " + entry.getKey() + " -> " + entry.getValue());
        }

        // Hiển thị bệnh nhân của 1 khoa cụ thể
        String searchDept = "Tim mạch";
        System.out.println("\nDanh sách khoa " + searchDept + ":");
        if (departmentMap.containsKey(searchDept)) {
            for (Patient p : departmentMap.get(searchDept)) {
                System.out.println(p);
            }
        }

        // Tìm khoa đông bệnh nhân nhất
        String busiestDept = null;
        int max = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            if (entry.getValue().size() > max) {
                max = entry.getValue().size();
                busiestDept = entry.getKey();
            }
        }

        System.out.println("\nKhoa " + busiestDept + " đang đông nhất (" + max + " bệnh nhân)");
    }
}