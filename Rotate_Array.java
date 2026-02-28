import java.util.*;

public class RotateArray {
    
    // Helper function to reverse array between two indices
    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        
        k = k % arr.length;  // handle large k
        
        // Step 1: Reverse entire array
        reverse(arr, 0, arr.length - 1);
        
        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);
        
        // Step 3: Reverse remaining elements
        reverse(arr, k, arr.length - 1);
        
        System.out.println(Arrays.toString(arr));
    }
}