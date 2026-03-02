import java.util.Stack;

public class Bai3 {

    static class MedicationProcessChecker {
        private Stack<String> stack = new Stack<>();

        public boolean checkProcess(String[] actions) {
            reset();
            for (int i = 0; i < actions.length; i++) {
                String action = actions[i];

                if (action.equalsIgnoreCase("PUSH")) {
                    stack.push("Medication");
                    System.out.println("Bước " + (i + 1) + ": PUSH → Phát thuốc");
                }
                else if (action.equalsIgnoreCase("POP")) {
                    if (stack.isEmpty()) {
                        System.out.println("Bước " + (i + 1) + ": POP → LỖI! Không thể hoàn tất khi chưa phát thuốc.");
                        return false;
                    }
                    stack.pop();
                    System.out.println("Bước " + (i + 1) + ": POP → Hoàn tất phát thuốc");
                }
                else {
                    System.out.println("Bước " + (i + 1) + ": LỖI! Hành động không hợp lệ: " + action);
                    return false;
                }
            }

            if (!stack.isEmpty()) {
                System.out.println("KẾT THÚC CA TRỰC → LỖI! Còn thuốc chưa hoàn tất.");
                return false;
            }

            System.out.println("KẾT THÚC CA TRỰC → Quy trình hợp lệ.");
            return true;
        }

        public void reset() {
            stack.clear();
        }
    }

    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        System.out.println("=== Test 1: Hợp lệ ===");
        String[] actions1 = {"PUSH", "PUSH", "POP", "POP"};
        checker.checkProcess(actions1);

        System.out.println("\n=== Test 2: Sai do POP khi rỗng ===");
        String[] actions2 = {"POP", "PUSH"};
        checker.checkProcess(actions2);

        System.out.println("\n=== Test 3: Sai do chưa hoàn tất ===");
        String[] actions3 = {"PUSH", "PUSH", "POP"};
        checker.checkProcess(actions3);
    }
}