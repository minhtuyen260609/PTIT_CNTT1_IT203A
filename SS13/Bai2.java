import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai2{
    public static List<String> uniqueAndSort(List<String> input){
        ArrayList<String> result=new ArrayList<>();
        for(String drug:input){
            if(!result.contains(drug)){
                result.add(drug);
            }
        }
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("Paracetamol");
        list.add("Ibuprofen");
        list.add("Panadol");
        list.add("Paracetamol");
        list.add("Aspirin");
        list.add("Ibuprofen");
        System.out.println("Input: "+list);
        List<String> output=uniqueAndSort(list);
        System.out.println("Output: "+output);
    }
}