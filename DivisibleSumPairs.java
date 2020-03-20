import java.util.*;
/*
* TODO You are given an array of
*  n integers,ar=[ar[0,ar[1],..ar[n-1] , and a positive integer,k
*  Find and print the number of (i,j) pairs where i<j  and ar[i] +ar[j]  is divisible by k .

TODO For example,ar[1,2,3,4,5,6  and k=5 . Our three pairs meeting the criteria are
* TODO[1,4],[2,3]  and 4,6].*/
public class DivisibleSumPairs {

        public int divisibleby(int n,int k,int[] ar){
            return 0;
        }

        public static void main(String[] args){
            //int[] test = {1,2,3,4,5,6};
            int[] test = {1,3,2,6,1,2};
            int count =0;
            int j =1;
            for (int i = 0; i <test.length ; i++) {
                for (int k = 1; k < test.length ; k++) {
                    if(i<k){
                        if((test[k]+test[i])%3==0){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
}
