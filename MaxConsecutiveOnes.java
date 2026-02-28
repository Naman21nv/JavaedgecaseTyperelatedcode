/**
 * Finds the maximum number of consecutive 1s in a binary array.
 * Handles edge cases: empty, null, all zeros, all ones, single element.
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        
        // Edge case: Null or empty array
        if(arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }
        
        int count = 0;  // Current consecutive 1s count
        int max = 0;    // Maximum consecutive 1s found
        
        // Single pass algorithm - Time: O(n), Space: O(1)
        for(int num : arr) {
            if(num == 1) {
                count++;  // Increment count for consecutive 1s
                max = Math.max(max, count);  // Update max if current count is higher
            } else {
                count = 0;  // Reset count when 0 is encountered
            }
        }
        
        // Edge case: No 1s found (all zeros)
        if(max == 0) {
            System.out.println("No consecutive 1s found");
        } else {
            System.out.println("Max consecutive 1s = " + max);
        }
    }
}