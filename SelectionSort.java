public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int min_index = i; // assuming this min element in the unsorted array
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }

            // placing the minimum element in the beginning of the unsorted array
            if(min_index != i){
                swap(arr,i,min_index);
            }
        }
    }

    public static void swap(int [] arr,int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int arr[] = {5,9,3,4,1,2};
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i + "\t");
        }
    }
}
