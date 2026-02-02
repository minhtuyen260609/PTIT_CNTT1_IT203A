public class Bai3{
    public static void main(String[]args){
        double[]scores={6.5,8.0,4.5};
        System.out.println("Danh sach diem: 6.5, 8.0, 4.5");
        double avg=ScoreUtils.calculateAverage(scores);
        System.out.println(">> Ket qua xu ly:");
        System.out.println("- Diem trung binh ca lop: "+avg);
        for(double s:scores){
            System.out.println("- Diem "+s+": "+(ScoreUtils.checkPass(s)?"Dat":"Truot"));
        }
    }
}
class ScoreUtils{
    public static boolean checkPass(double score){
        return score>=5.0;
    }
    public static double calculateAverage(double[]scores){
        double sum=0;
        for(double s:scores)sum+=s;
        return sum/scores.length;
    }
}
