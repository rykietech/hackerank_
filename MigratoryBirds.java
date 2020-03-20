public class MigratoryBirds {

    public int getCom(int[] arr){
        int com = 0;
        return 0;
    }
    public static void main(String[] args){
        int[] test ={1,2,3,4,5,4,3,2,1,3,4};
        int com =0;

        for(int i=0;i<test.length;i++)
            test[(test[i]%10)-1] = test[(test[i]%10)-1]+10;
        int max = -1,q=0;
        for(int i=0;i<test.length;i++){
            if(max<test[i]/10){
                max = test[i]/10;
                q=i+1;
            }
        }
        System.out.print(q);

       /* for (int i = 0; i <test.length; i++) {
            for (int j = 1; j <test.length ; j++) {
            if(i<j){
                if(test[i]==test[j]){
                    com=test[j];
                }
            }
            //System.out.println("element at "+i+": "+test[i]+"\tElement at "+j+": "+test[j]);
        }
    }*/

        //System.out.print (com);
    }
}
