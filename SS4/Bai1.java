import java.util.Scanner;

public class Bai1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine().trim().replaceAll("\\s+"," ");
        String author=sc.nextLine().trim().replaceAll("\\s+"," ").toLowerCase();
        title=title.toUpperCase();
        String[] arr=author.split(" ");
        String authorFormatted="";
        for(String s:arr){
            authorFormatted+=Character.toUpperCase(s.charAt(0))+s.substring(1)+" ";
        }
        authorFormatted=authorFormatted.trim();
        System.out.println(title+" Tác giả: "+authorFormatted);
    }
}
