/**
 * Kadane's Algorithm: Finds maximum sum of contiguous subarray.
 * 
 * TCS NQT Question Format:
 * "Given an array of integers, find the contiguous subarray with the largest sum.
 *  Example: arr[] = {-2,1,-3,4,-1,2,1,-5,4}
 *  Output: 6 (subarray {4,-1,2,1} has maximum sum)"
 * 
 * Handles edge cases: empty, null, single element, all negatives.
 */
public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        // Edge case: Null or empty array
        if(arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }
        
        // Edge case: Single element
        if(arr.length == 1) {
            System.out.println("Maximum Subarray Sum = " + arr[0]);
            return;
        }
        
        // Kadane's Algorithm - Time: O(n), Space: O(1)
        int maxSoFar = arr[0];     // Maximum sum found so far
        int currentSum = arr[0];   // Current subarray sum
        
        // Start from index 1, compare: take current element alone OR extend previous subarray
        for(int i = 1; i < arr.length; i++) {
            // Decision: Start new subarray from arr[i] OR continue previous subarray
            // If currentSum + arr[i] < arr[i], better to start fresh from arr[i]
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            
            // Update global maximum if current sum is greater
            maxSoFar = Math.max(maxSoFar, currentSum);
        }
        
        System.out.println("Maximum Subarray Sum = " + maxSoFar);
        
        // Note: For all negative numbers, algorithm returns least negative number
        // Example: {-5,-2,-8,-1} returns -1
    }
}

/*
 * TCS NQT QUESTION VARIATIONS:
 * 
 * 1. Basic: "Find the maximum sum of contiguous subarray"
 * 2. With Index: "Find the starting and ending indices of maximum sum subarray"
 * 3. Print Subarray: "Print the subarray that has maximum sum"
 * 4. With Constraint: "Find maximum sum with at most K elements"
 * 5. Circular Array: "Find maximum subarray sum in circular array"
 * 
 * APPROACH EXPLANATION:
 * - At each position, decide: start new subarray OR extend existing
 * - If adding current element decreases sum, start fresh
 * - Keep track of maximum sum encountered
 */ 
 