public class BubbleSort {
    public static void bubbleSort(int []arr, int n ){
        for(int i = 0;i<n-1;i++){
            int flag = 0; // for checking if swapping is done
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag += 1;
                }
            }
            if(flag==0) break; // If no swap happened, the array is already sorted
        }
    }
    public static void swap(int [] arr, int a, int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {5,25,12,35,32,12};
        int n = arr.length;
        bubbleSort(arr,n);
        for(int i :arr){
            System.out.print(i + "\t");
        }
    }
}
