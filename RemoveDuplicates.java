import java.util.*;

/**
 * Removes duplicate elements from an array using HashSet and LinkedHashSet.
 * HashSet: Unordered, faster lookup
 * LinkedHashSet: Maintains insertion order
 * Handles edge cases: empty, null, all duplicates, no duplicates, single element.
 */
public class RemoveDuplicatesHashSet {
    public static void main(String[] args) {
        
        int[] arr = {4, 2, 7, 2, 4, 9, 1};
        
        // Edge case: Null or empty array
        if(arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }
        
        // Edge case: Single element (no duplicates possible)
        if(arr.length == 1) {
            System.out.println("Array after removing duplicates:");
            System.out.println(arr[0]);
            return;
        }
        
        // HashSet stores only unique elements (ignores duplicates)
        // Time: O(n), Space: O(n) where n is array length
        // Note: HashSet doesn't maintain insertion order
        HashSet<Integer> set = new HashSet<>();
        
        // Add all elements - HashSet automatically ignores duplicates
        for(int num : arr) {
            set.add(num);  // Duplicate values are not added
        }
        
        // Edge case: All elements were duplicates
        if(set.isEmpty()) {
            System.out.println("No elements after removing duplicates");
            return;
        }
        
        // Display unique elements (order may vary - HashSet doesn't maintain order)
        System.out.println("Array after removing duplicates (HashSet - unordered):");
        for(int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();  // New line after output
        
        // Alternative: LinkedHashSet maintains insertion order
        // If order preservation is needed, use LinkedHashSet instead
        LinkedHashSet<Integer> orderedSet = new LinkedHashSet<>();
        for(int num : arr) {
            orderedSet.add(num);  // Maintains order of first occurrence
        }
        
        System.out.println("Array after removing duplicates (LinkedHashSet - maintains order):");
        for(int num : orderedSet) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Note: Original array has " + arr.length + " elements, unique elements: " + set.size()
        System.out.println("Original: " + arr.length + " elements, After: " + set.size() + " unique elements");
    }
}