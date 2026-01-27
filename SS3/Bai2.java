import java.util.Scanner;
public class Bai2{
    static int searchBooks(String[] books,String name){
        for(int i=0;i<books.length;i++){
            if(books[i].equals(name)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String[] books={"Doraemon","Conan","Harry Potter","Sherlock Holmes","One Piece"};
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập tên sách cần tìm: ");
        String name=sc.nextLine();
        int pos=searchBooks(books,name);
        if(pos>=0){
            System.out.println("Tìm thấy sách '"+name+"' tại vị trí số: "+pos);
        }else{
            System.out.println("Sách không tồn tại trong thư viện.");
        }
    }
}
