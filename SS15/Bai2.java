import java.util.LinkedList;
import java.util.Queue;

public class Bai2 {

    static class Patient {
        private String id;
        private String name;
        private int age;

        public Patient(String id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public String getId() { return id; }
        public String getName() { return name; }
        public int getAge() { return age; }

        public void setId(String id) { this.id = id; }
        public void setName(String name) { this.name = name; }
        public void setAge(int age) { this.age = age; }

        @Override
        public String toString() {
            return "ID: " + id + " | Name: " + name + " | Age: " + age;
        }
    }

    static class PatientQueue {
        private Queue<Patient> queue = new LinkedList<>();

        public void addPatient(Patient p) {
            queue.offer(p);
            System.out.println("Đã thêm bệnh nhân: " + p);
            displayQueue();
        }

        public Patient callNextPatient() {
            if (queue.isEmpty()) {
                System.out.println("Không còn bệnh nhân chờ!");
                return null;
            }
            Patient p = queue.poll();
            System.out.println("Đang khám: " + p);
            displayQueue();
            return p;
        }

        public Patient peekNextPatient() {
            if (queue.isEmpty()) {
                System.out.println("Hàng đợi rỗng!");
                return null;
            }
            return queue.peek();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public void displayQueue() {
            System.out.println("=== Danh sách bệnh nhân đang chờ (Front → Rear) ===");
            for (Patient p : queue) {
                System.out.println(p);
            }
            System.out.println("----------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        PatientQueue pq = new PatientQueue();

        pq.addPatient(new Patient("P01", "Nguyen Van A", 25));
        pq.addPatient(new Patient("P02", "Tran Thi B", 30));
        pq.addPatient(new Patient("P03", "Le Van C", 40));

        System.out.println("Bệnh nhân tiếp theo: " + pq.peekNextPatient());

        pq.callNextPatient();
        pq.callNextPatient();
    }
}