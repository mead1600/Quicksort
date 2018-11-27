public class Quicksort {

    public static void Quicksort(int[] arr, int left, int right){
        if(left < right)
        {
            int pivot = partition(arr, left, right);

            Quicksort(arr, left, pivot - 1);
            Quicksort(arr, pivot + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right){
        int pivot = right;
        int i = left - 1;
        for(int j = left; j < right; j++){
            if(arr[j] <= pivot){
                i++;
                int val = arr[i];
                arr[i] = arr[j];
                arr[j] = val;
            }
        }
        int num = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = num;
        return arr[i + 1];
    }

}
