import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Solution {

    // Complete the kangaroo function below.
    public String kangaroo(int x1, int v1, int x2, int v2) {
        int x_1 = x1;
        int x_2 = x2;
        int v_1 = v1;
        int v_2 = v2;
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i<=10000;i++){
              n1 = x_1 + i*v_1;
              n2 = x_2 + i*v_2;
              if (n1 ==n2){
                  return "YES";            
                }  
              else if (x_1 <x_2 && v_1 <v_2){
                      break;
                              
                  }
                              
                          
            }
        return "NO";
  

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      Solution j = new Solution();
            
       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);
     String result = j.kangaroo(x1, v1, x2, v2);
        

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    
      //System.out.println(j.kangaroo(0, 2, 5, 3));
    }
}
