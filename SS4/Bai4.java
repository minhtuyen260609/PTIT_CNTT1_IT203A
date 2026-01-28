import java.util.regex.*;

public class Bai4{
    public static void main(String[] args){
        String cardID="TV202312345";

        Pattern pFull=Pattern.compile("^[A-Z]{2}[0-9]{9}$");
        Matcher mFull=pFull.matcher(cardID);

        if(!mFull.matches()){
            if(!cardID.matches("^[A-Z]{2}.*")){
                System.out.println("Thiếu tiền tố TV");
            }else if(!cardID.matches("^[A-Z]{2}[0-9]{4}.*")){
                System.out.println("Năm không hợp lệ");
            }else if(!cardID.matches("^[A-Z]{2}[0-9]{4}[0-9]{5}$")){
                System.out.println("Mã số cuối không hợp lệ");
            }else{
                System.out.println("Sai định dạng mã thẻ");
            }
        }else{
            System.out.println("Mã thẻ hợp lệ");
        }
    }
}
