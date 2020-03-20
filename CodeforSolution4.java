import java.util.*;
public class CodeforSolution4 {

    public int[] breakingRecords(int[] scores){
        int high= scores[0];
        int low=scores[0];
        int coun1 = 0;
        int coun2 = 0;
        int[] result = new int[2];
        for(int i =0;i <scores.length;i++){
            if(high<scores[i]){
                high = scores[i];
                coun1++;
            }
            if((low!= scores[i])&&(low>scores[i])){
                low = scores[i];
                coun2++;
            }
        }

        result[0] = coun1;
        result[1] = coun2;

        return result;
    }

    public static void main(String[] args){
        int[] test = {10,5,20,20,4,5,2,25,1};
        CodeforSolution4 t1 = new CodeforSolution4 ();
       System.out.println(Arrays.toString (t1.breakingRecords (test))) ;
    }
}
