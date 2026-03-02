import java.util.PriorityQueue;
import java.util.Comparator;

public class Bai4 {

    static class EmergencyPatient {
        private String id;
        private String name;
        private int priority; // 1: cấp cứu, 2: thường
        private long order;   // đảm bảo FIFO nếu cùng mức độ

        public EmergencyPatient(String id, String name, int priority) {
            this.id = id;
            this.name = name;
            this.priority = priority;
        }

        public String getId() { return id; }
        public String getName() { return name; }
        public int getPriority() { return priority; }
        public long getOrder() { return order; }

        public void setOrder(long order) { this.order = order; }

        @Override
        public String toString() {
            return "ID: " + id +
                    " | Name: " + name +
                    " | Priority: " + (priority == 1 ? "Cấp cứu" : "Thường");
        }
    }

    static class EmergencyQueue {
        private long counter = 0;

        private PriorityQueue<EmergencyPatient> queue =
                new PriorityQueue<>(new Comparator<EmergencyPatient>() {
                    @Override
                    public int compare(EmergencyPatient p1, EmergencyPatient p2) {
                        if (p1.getPriority() != p2.getPriority()) {
                            return p1.getPriority() - p2.getPriority();
                        }
                        return Long.compare(p1.getOrder(), p2.getOrder());
                    }
                });

        public void addPatient(EmergencyPatient p) {
            p.setOrder(counter++);
            queue.offer(p);
            System.out.println("Đã thêm: " + p);
        }

        public EmergencyPatient callNextPatient() {
            if (queue.isEmpty()) {
                System.out.println("Không còn bệnh nhân!");
                return null;
            }
            EmergencyPatient p = queue.poll();
            System.out.println("Đang khám: " + p);
            return p;
        }

        public void displayQueue() {
            System.out.println("=== Danh sách bệnh nhân chờ khám ===");
            for (EmergencyPatient p : queue) {
                System.out.println(p);
            }
            System.out.println("-------------------------------------");
        }
    }

    public static void main(String[] args) {

        EmergencyQueue eq = new EmergencyQueue();

        eq.addPatient(new EmergencyPatient("E01", "Nguyen Van A", 2));
        eq.addPatient(new EmergencyPatient("E02", "Tran Thi B", 1));
        eq.addPatient(new EmergencyPatient("E03", "Le Van C", 2));
        eq.addPatient(new EmergencyPatient("E04", "Pham Thi D", 1));

        eq.displayQueue();

        System.out.println("\n--- Thứ tự khám ---");
        while (true) {
            EmergencyPatient p = eq.callNextPatient();
            if (p == null) break;
        }
    }
}