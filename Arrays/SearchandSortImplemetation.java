import java.util.Arrays;

public class SearchandSortImplemetation {

    public static void main(String[] args) {
        
        // Example array
        int[] arr = {34, 7, 23, 32, 5, 62, 32, 32, 12, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        // Linear Search Example
        int target = 32;
        int linearSearchResult = linearSearch(arr, target);
        if (linearSearchResult != -1) {
            System.out.println("Linear Search: Element " + target + " found at index " + linearSearchResult);
        } else {
            System.out.println("Linear Search: Element " + target + " not found.");
        }

        // Bubble Sort Example
        bubbleSort(arr);
        System.out.println("Bubble Sort: Sorted Array: " + Arrays.toString(arr));
    }

    // Linear Search Method
    public static int linearSearch(int[] arr, int target) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // return the index if target is found
            }
        }
        return -1;  // return -1 if target is not found
    }

    // Bubble Sort Method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Outer loop to control the number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
