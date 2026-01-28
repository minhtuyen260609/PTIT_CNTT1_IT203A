import java.util.regex.*;

public class Bai5{
    public static void main(String[] args){
        String log=
                "2024-05-20 | User: NguyenVanA | Action: BORROW\n"+
                        "BookID: BK12345\n"+
                        "2024-05-21 | User: TranVanB | Action: RETURN\n"+
                        "BookID: BK54321";

        Pattern p=Pattern.compile("(\\d{4}-\\d{2}-\\d{2})\\s*\\|\\s*User:\\s*(\\w+)\\s*\\|\\s*Action:\\s*(BORROW|RETURN)\\s*\\nBookID:\\s*(BK\\d+)");
        Matcher m=p.matcher(log);

        int borrowCount=0;
        int returnCount=0;

        while(m.find()){
            String date=m.group(1);
            String user=m.group(2);
            String action=m.group(3);
            String bookID=m.group(4);

            if(action.equals("BORROW"))borrowCount++;
            else returnCount++;

            System.out.println("Ngày: "+date);
            System.out.println("Người dùng: "+user);
            System.out.println("Hành động: "+action);
            System.out.println("Mã sách: "+bookID);
            System.out.println();
        }

        System.out.println("Tổng BORROW: "+borrowCount);
        System.out.println("Tổng RETURN: "+returnCount);
    }
}
