import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Bai5 {

    static class Patient {
        private String id;
        private String name;
        private int age;

        public Patient(String id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "ID: " + id + " | Name: " + name + " | Age: " + age;
        }
    }

    static class TreatmentStep {
        private String description;
        private String time;

        public TreatmentStep(String description, String time) {
            this.description = description;
            this.time = time;
        }

        @Override
        public String toString() {
            return time + " - " + description;
        }
    }

    static class EmergencyCase {
        private Patient patient;
        private Stack<TreatmentStep> steps = new Stack<>();

        public EmergencyCase(Patient patient) {
            this.patient = patient;
        }

        public void addStep(TreatmentStep step) {
            steps.push(step);
            System.out.println("Thêm bước: " + step);
        }

        public TreatmentStep undoStep() {
            if (steps.isEmpty()) {
                System.out.println("Không có bước để undo!");
                return null;
            }
            TreatmentStep removed = steps.pop();
            System.out.println("Undo bước: " + removed);
            return removed;
        }

        public void displaySteps() {
            System.out.println("=== Các bước xử lý (mới → cũ) ===");
            for (int i = steps.size() - 1; i >= 0; i--) {
                System.out.println(steps.get(i));
            }
            System.out.println("----------------------------------");
        }

        public Patient getPatient() {
            return patient;
        }
    }

    static class EmergencyCaseQueue {
        private Queue<EmergencyCase> cases = new LinkedList<>();

        public void addCase(EmergencyCase c) {
            cases.offer(c);
            System.out.println("Tiếp nhận bệnh nhân: " + c.getPatient());
        }

        public EmergencyCase getNextCase() {
            if (cases.isEmpty()) {
                System.out.println("Không còn ca cấp cứu!");
                return null;
            }
            EmergencyCase c = cases.poll();
            System.out.println("Đang xử lý: " + c.getPatient());
            return c;
        }
    }

    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        EmergencyCase case1 = new EmergencyCase(
                new Patient("E01", "Nguyen Van A", 30));
        EmergencyCase case2 = new EmergencyCase(
                new Patient("E02", "Tran Thi B", 45));

        queue.addCase(case1);
        queue.addCase(case2);

        System.out.println("\n--- Xử lý ca đầu tiên ---");
        EmergencyCase current = queue.getNextCase();

        if (current != null) {
            current.addStep(new TreatmentStep("Tiếp nhận bệnh nhân", "08:00"));
            current.addStep(new TreatmentStep("Chẩn đoán ban đầu", "08:05"));
            current.addStep(new TreatmentStep("Tiêm thuốc giảm đau", "08:10"));

            current.displaySteps();

            System.out.println("\nUndo bước gần nhất:");
            current.undoStep();

            current.displaySteps();
        }
    }
}