import java.util.regex.*;

public class Bai6{
    public static void main(String[] args){
        String review="Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng để đọc trong bất kỳ hoàn cảnh nào vì cách trình bày quá kém và thiếu logic.";

        String[] blacklist={"tệ","ngu ngốc","không đáng"};

        for(String bad:blacklist){
            Pattern p=Pattern.compile(bad,Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE);
            Matcher m=p.matcher(review);
            StringBuffer sb=new StringBuffer();
            while(m.find()){
                String stars="*".repeat(m.group().length());
                m.appendReplacement(sb,stars);
            }
            m.appendTail(sb);
            review=sb.toString();
        }

        if(review.length()>200){
            int cut=review.substring(0,200).lastIndexOf(" ");
            StringBuilder shortReview=new StringBuilder();
            shortReview.append(review.substring(0,cut)).append("...");
            review=shortReview.toString();
        }

        System.out.println("Review sau khi xử lý: "+review);
    }
}
