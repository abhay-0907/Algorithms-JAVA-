public class InsertionSort {
    public static void insertionSort(int []arr){
        int n = arr.length;

        // Loop through elements from the second element (index 1) to the last
        for(int i = 1;i<n;i++){

            int current = arr[i]; // Store the current element to be compared

            int j = i - 1;  // Assume the left part of the array is sorted

            // Move elements of arr[0...i-1] that are greater than current
            // to one position ahead of their current position
            while(j >= 0 && arr[j]>current){
                arr[j+1] = arr[j]; // Shift the larger element to the right

                j--; // // Move to the next element on the left
            }
            
            // Place the current element at its correct position
            arr[j+1] = current;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,2,9,10,3,6,13,11,35};
        insertionSort(arr);
        for(int i : arr){
            System.out.print(i + "\t");
        }
    }
}
