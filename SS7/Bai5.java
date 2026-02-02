public class Bai5{
    public static void main(String[]args){
        double score=8.5;
        if(score>=Config.MIN_SCORE&&score<=Config.MAX_SCORE){
            System.out.println("Diem hop le:"+score);
        }else{
            System.out.println("Diem khong hop le");
        }
        // Config.MAX_SCORE=20; // loi bien dich: khong the gan lai bien final
    }
}
class Config{
    public static final double MAX_SCORE=10.0;
    public static final double MIN_SCORE=0.0;
}
