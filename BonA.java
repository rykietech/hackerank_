public class BonA {

    public static void main(String[] args){
        int[] arr ={3,10,2,9};
        int k = 1;
        int b = 12;
        int actual = 0;
        int charged = 0;
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            if(i!= k){
                arr2[i]=arr[i];
            }
        }
        for (int i = 0; i <arr2.length ; i++) {
            actual = actual+arr2[i];
        }
        actual = actual/2;
        if(b==actual){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.print ((b-actual));
        }
    }
}
