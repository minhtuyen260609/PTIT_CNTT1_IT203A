class User{
    private int id;
    private String username;
    private String password;
    private String email;
    User(int id,String username,String password,String email){
        this.id=id;
        this.username=username;
        setPassword(password);
        setEmail(email);
    }
    int getId(){
        return id;
    }
    String getUsername(){
        return username;
    }
    String getEmail(){
        return email;
    }
    void setPassword(String password){
        if(password!=null&&!password.isEmpty())this.password=password;
        else System.out.println("Password khong hop le");
    }
    void setEmail(String email){
        if(email!=null&&email.contains("@"))this.email=email;
        else System.out.println("Email khong hop le");
    }
    void hienThi(){
        System.out.println("ID: "+id);
        System.out.println("Username: "+username);
        System.out.println("Email: "+email);
        System.out.println("Password: ******");
        System.out.println();
    }
}
public class Bai6{
    public static void main(String[] args){
        User u1=new User(1,"admin","123456","admin@gmail.com");
        User u2=new User(2,"user","","usergmail.com");
        u1.hienThi();
        u2.hienThi();
        u2.setPassword("abc123");
        u2.setEmail("user@gmail.com");
        u2.hienThi();
    }
}
