public class BirthdayChocolate {
    //s=[2,2,1,3,2,]
    //d=4
    //m=2
    //output [2,2] and [1,3]
    public int rec(int[]a,int d,int m){
        int count = 0;
        for (int i = 0; i <a.length-m+1 ; i++) {
            int sum =0;
            for (int j = 0; j <m ; j++) {
                sum = sum +a[i+j];
            }
            if(sum==d){
                count++;
            }
        }
        return count;
    }
    //TODO find conscutive values of s that add up to 4
    public static void main(String[] args){
        //int[] bk = {2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1};
        int[] bk = {1,2,1,3,2};
        BirthdayChocolate t1 = new BirthdayChocolate ();
        System.out.println(t1.rec (bk,3,2));




    }
}
