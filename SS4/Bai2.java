import java.util.Scanner;

public class Bai2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String desc=sc.nextLine();
        if(desc.contains("Kệ:")){
            int start=desc.indexOf("Kệ:")+4;
            int end=desc.indexOf(",",start);
            if(end==-1)end=desc.length();
            String location=desc.substring(start,end).trim();
            String newDesc=desc.replace("Kệ:","vị trí lưu trữ:");
            System.out.println("Vị trí tìm thấy: "+location);
            System.out.println("Mô tả mới: "+newDesc);
        }else{
            System.out.println("Không tìm thấy thông tin kệ sách");
        }
    }
}
