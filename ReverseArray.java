import java.util.Arrays;

/**
 * ReverseArray - A program to reverse an array in-place using the two-pointer technique
 * 
 * ALGORITHM: Two-Pointer Approach
 * - Uses two pointers starting from opposite ends of the array
 * - Swaps elements at these positions and moves pointers towards center
 * - Continues until pointers meet in the middle
 * 
 * TIME COMPLEXITY: O(n) where n is the length of the array
 * - We iterate through half of the array (n/2 iterations)
 * 
 * SPACE COMPLEXITY: O(1)
 * - Only uses a constant amount of extra space (temp variable, two pointers)
 * - The reversal is done in-place without creating a new array
 * 
 * EDGE CASES HANDLED:
 * 1. Empty array (length = 0): Loop won't execute, array remains empty
 * 2. Single element (length = 1): Loop won't execute, array unchanged
 * 3. Two elements: Single swap occurs, elements exchanged
 * 4. Even length arrays: All pairs swapped correctly
 * 5. Odd length arrays: Middle element stays in place (correct behavior)
 * 
 * POTENTIAL ISSUES TO CONSIDER:
 * 1. Null array: Would throw NullPointerException at arr.length
 * 2. Large arrays: Still O(1) space, so memory efficient
 * 3. Thread safety: Not thread-safe - concurrent modifications could cause issues
 */
public class ReverseArray {
    
    /**
     * Main method demonstrating array reversal
     * 
     * @param args Command line arguments (not used)
     * 
     * EXAMPLE EXECUTION:
     * Input:  [1, 2, 3, 4, 5]
     * Output: [5, 4, 3, 2, 1]
     */
    public static void main(String[] args) {
        // Initialize test array with sample values
        // EDGE CASE: This is a normal case with odd length (5 elements)
        int[] arr = {1, 2, 3, 4, 5};
        
        // Left pointer: starts at the beginning of the array (index 0)
        int left = 0;
        
        // Right pointer: starts at the end of the array (index arr.length - 1)

        int right = arr.length - 1;
        
        while(left < right) {
            // SWAP OPERATION: Exchange elements at left and right positions
            
            // Step 1: Store left element in temporary variable
            // REASON: Prevents data loss when overwriting arr[left]
            int temp = arr[left];
            
            // Step 2: Copy right element to left position
            arr[left] = arr[right];
            
            // Step 3: Copy stored left element (from temp) to right position
            arr[right] = temp;
            
            // SWAP COMPLETE: Elements at positions left and right are now exchanged
            
            // Move left pointer one step towards center (increment)
            left++;
            
            // Move right pointer one step towards center (decrement)
            right--;
            
            // LOOP CONTINUES: Pointers move inward until they meet
        }
        
        /**
         * OUTPUT: Display the reversed array
         * Arrays.toString() converts array to readable string format: [5, 4, 3, 2, 1]
         * 
         * NOTE: The array is modified in-place, so 'arr' now contains reversed elements
         */
        System.out.println(Arrays.toString(arr));
    }
    
    
}