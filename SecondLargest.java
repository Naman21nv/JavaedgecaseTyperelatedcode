/**
 * Finds the second largest element in an array.
 * Handles edge cases: empty, single element, duplicates, and all same elements.
 */
public class SecondLargest {
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        
        // Edge case: Empty or single element
        if(arr == null || arr.length < 2) {
            System.out.println("Array must have at least 2 elements");
            return;
        }
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        // Traverse array once to find first and second largest
        // Time: O(n), Space: O(1)
        for(int num : arr) {
            if(num > first) {
                second = first;  // Previous largest becomes second largest
                first = num;
            } else if(num > second && num != first) {
                second = num;  // Update second if num is between first and second
            }
        }
        
        // Edge case: No valid second largest found (all elements same)
        if(second == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists");
            return;
        }
        
        System.out.println("Second Largest = " + second);
    }
}