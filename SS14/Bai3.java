import java.util.*;

public class Bai3 {
    public static void main(String[] args) {

        Set<String> drugComponents = new HashSet<>();
        drugComponents.add("Aspirin");
        drugComponents.add("Caffeine");
        drugComponents.add("Paracetamol");

        Set<String> allergyList = new HashSet<>();
        allergyList.add("Penicillin");
        allergyList.add("Aspirin");

        // Tìm giao (cảnh báo dị ứng)
        Set<String> warning = new HashSet<>(drugComponents);
        warning.retainAll(allergyList);

        // Tìm hiệu (thành phần an toàn)
        Set<String> safeComponents = new HashSet<>(drugComponents);
        safeComponents.removeAll(allergyList);

        System.out.println("Cảnh báo dị ứng: " + warning);
        System.out.println("Thành phần an toàn: " + safeComponents);
    }
}