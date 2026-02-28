/**
 * Count Sorted Rows: Counts how many rows in a 2D matrix are sorted in ascending order.
 * 
 * ALGORITHM APPROACH:
 * - Iterate through each row of the matrix
 * - For each row, check if elements are in increasing order
 * - If any element is smaller than previous, row is not sorted
 * - Count all sorted rows
 * 
 * Time: O(m*n) where m=rows, n=columns
 * Space: O(1)
 * 
 * Handles edge cases: empty matrix, null, single row, single column, all sorted, none sorted.
 */
public class CountSortedRows {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3},    // Sorted ✓
            {3, 2, 1},    // Not sorted (decreasing)
            {4, 5, 6}     // Sorted ✓
        };
        
        // Edge case: Null or empty matrix
        if(matrix == null || matrix.length == 0) {
            System.out.println("Matrix is empty or null");
            return;
        }
        
        int count = 0;  // Counter for sorted rows
        
        // Iterate through each row
        for(int i = 0; i < matrix.length; i++) {
            
            // Edge case: Empty row
            if(matrix[i] == null || matrix[i].length == 0) {
                continue;  // Skip empty row
            }
            
            // Edge case: Single element row (always sorted)
            if(matrix[i].length == 1) {
                count++;
                continue;
            }
            
            boolean isSorted = true;  // Assume row is sorted
            
            // Check if row is sorted (compare adjacent elements)
            for(int j = 1; j < matrix[i].length; j++) {
                // If current element < previous element, not sorted
                if(matrix[i][j] < matrix[i][j-1]) {
                    isSorted = false;
                    break;  // No need to check further
                }
            }
            
            // Increment count if row is sorted
            if(isSorted) {
                count++;
            }
        }
        
        System.out.println("Sorted Rows Count = " + count);
    }
}

/*
 * EXAMPLE WALKTHROUGH:
 * 
 * Matrix:
 * {1, 2, 3}  -> Check: 2>=1? Yes, 3>=2? Yes -> Sorted ✓ (count=1)
 * {3, 2, 1}  -> Check: 2>=3? No -> Not Sorted ✗ (count=1)
 * {4, 5, 6}  -> Check: 5>=4? Yes, 6>=5? Yes -> Sorted ✓ (count=2)
 * 
 * Answer: 2 sorted rows
 * 
 * EDGE CASE SCENARIOS:
 * 
 * 1. All sorted rows:
 *    {{1,2,3}, {4,5,6}} -> Count = 2
 * 
 * 2. No sorted rows:
 *    {{3,2,1}, {6,5,4}} -> Count = 0
 * 
 * 3. Single element rows:
 *    {{5}, {3}, {7}} -> Count = 3 (all sorted)
 * 
 * 4. Mixed lengths:
 *    {{1,2}, {5,4,3}, {7}} -> Count = 2 (row 0 and row 2)
 * 
 * 5. Duplicate values (considered sorted):
 *    {1,2,2,3} -> Sorted ✓ (2>=2 is true)
 */