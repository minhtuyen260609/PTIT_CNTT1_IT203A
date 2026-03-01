import java.util.*;

class Patient {
    String name;
    int severity;
    int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return name + " (Mức " + severity + ", đến lúc " + arrivalTime + ")";
    }
}

public class Bai5 {

    public static void main(String[] args) {

        TreeSet<Patient> triageQueue = new TreeSet<>(
                (p1, p2) -> {
                    if(p1.severity != p2.severity)
                        return p1.severity - p2.severity;
                    if(p1.arrivalTime != p2.arrivalTime)
                        return p1.arrivalTime - p2.arrivalTime;
                    return p1.name.compareTo(p2.name);
                }
        );

        triageQueue.add(new Patient("Bệnh nhân A", 3, 800));
        triageQueue.add(new Patient("Bệnh nhân B", 1, 815));
        triageQueue.add(new Patient("Bệnh nhân C", 1, 805));
        triageQueue.add(new Patient("Bệnh nhân D", 2, 810));

        System.out.println("Thứ tự xử lý cấp cứu:");

        for(Patient p : triageQueue) {
            System.out.println(p);
        }
    }
}