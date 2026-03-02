import java.util.Stack;

public class Bai1 {

    static class EditAction {
        private String description;
        private String time;

        public EditAction(String description, String time) {
            this.description = description;
            this.time = time;
        }

        public String getDescription() {
            return description;
        }

        public String getTime() {
            return time;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Time: " + time + " | Action: " + description;
        }
    }

    static class MedicalRecordHistory {
        private Stack<EditAction> history = new Stack<>();

        public void addEdit(EditAction action) {
            history.push(action);
            System.out.println("Đã thêm chỉnh sửa: " + action);
            displayHistory();
        }

        public EditAction undoEdit() {
            if (history.isEmpty()) {
                System.out.println("Không có chỉnh sửa để undo!");
                return null;
            }
            EditAction removed = history.pop();
            System.out.println("Đã undo: " + removed);
            displayHistory();
            return removed;
        }

        public EditAction getLatestEdit() {
            if (history.isEmpty()) {
                System.out.println("Stack rỗng!");
                return null;
            }
            return history.peek();
        }

        public boolean isEmpty() {
            return history.isEmpty();
        }

        public void displayHistory() {
            System.out.println("=== Lịch sử chỉnh sửa (Top → Bottom) ===");
            for (int i = history.size() - 1; i >= 0; i--) {
                System.out.println(history.get(i));
            }
            System.out.println("-----------------------------------------");
        }
    }

    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Thêm triệu chứng sốt", "10:00"));
        history.addEdit(new EditAction("Cập nhật đơn thuốc", "10:05"));
        history.addEdit(new EditAction("Chỉnh sửa chẩn đoán", "10:10"));

        System.out.println("Chỉnh sửa gần nhất: " + history.getLatestEdit());

        history.undoEdit();
        history.undoEdit();
    }
}