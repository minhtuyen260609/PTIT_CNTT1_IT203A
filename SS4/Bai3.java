import java.time.LocalDate;

public class Bai3{
    public static void main(String[] args){
        String[] transactions={
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        long start1=System.nanoTime();
        String report1="BÁO CÁO MƯỢN SÁCH ---\n";
        report1+="Ngày tạo: "+LocalDate.now()+"\n";
        for(String t:transactions){
            report1+="Giao dịch: "+t+"\n";
        }
        long timeString=System.nanoTime()-start1;

        long start2=System.nanoTime();
        StringBuilder report2=new StringBuilder();
        report2.append("BÁO CÁO MƯỢN SÁCH ---\n");
        report2.append("Ngày tạo: ").append(LocalDate.now()).append("\n");
        for(String t:transactions){
            report2.append("Giao dịch: ").append(t).append("\n");
        }
        long timeBuilder=System.nanoTime()-start2;

        System.out.println(report2);
        System.out.println("Thời gian thực thi với StringBuilder: "+timeBuilder);
        System.out.println("Thời gian thực thi với String: "+timeString);
    }
}
