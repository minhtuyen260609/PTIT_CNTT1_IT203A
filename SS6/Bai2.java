class Account{
    String username;
    String password;
    String email;
    Account(String username,String password,String email){
        this.username=username;
        this.password=password;
        this.email=email;
    }
    void doiMatKhau(String matKhauMoi){
        password=matKhauMoi;
    }
    void hienThi(){
        System.out.println("Username: "+username);
        System.out.println("Email: "+email);
        System.out.println("Password: ******");
        System.out.println();
    }
}
public class Bai2{
    public static void main(String[] args){
        Account acc=new Account("user01","123456","user01@gmail.com");
        acc.hienThi();
        acc.doiMatKhau("abc123");
        acc.hienThi();
    }
}
