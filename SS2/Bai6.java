import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int max=0;
        int min=0;
        int sum=0;
        int count=0;
        String[] days={"Thu 2","Thu 3","Thu 4","Thu 5","Thu 6","Thu 7","Chu Nhat"};
        for(int i=0;i<7;i++){
            System.out.print("Nhap luot muon ngay "+days[i]+": ");
            int value=sc.nextInt();
            if(value==0)continue;
            if(count==0){
                max=value;
                min=value;
            }else{
                if(value>max)max=value;
                if(value<min)min=value;
            }
            sum+=value;
            count++;
        }
        System.out.println("---KET QUA THONG KE ---");
        System.out.println("Luot muon cao nhat: "+max);
        System.out.println("Luot muon thap nhat: "+min);
        System.out.println("Trung binh luot muon/ngay: "+(count>0?(double)sum/count:0));
    }
}
