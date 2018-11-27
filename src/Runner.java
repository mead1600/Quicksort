import java.util.Arrays;

public class Runner {
    public static void main(String[] args){
        int[] sorting = {1,4,3,8,6,7,5,9};//randomInt(10);
        System.out.println("Original array: "+ Arrays.toString(sorting));

        int left = sorting[0];
        int right = sorting[sorting.length - 1];

        Quicksort.Quicksort(sorting, 0, sorting.length - 1);
        System.out.println("Quicksorted array: "+ Arrays.toString(sorting));
    }


    /*public static int[] randomInt(int length){
        int[] arr = new int[length];
        for( int i = 0; i < length; i++){
            arr[i] = (int)(Math.random()*10);
        }
        return arr;
    }*/
}
