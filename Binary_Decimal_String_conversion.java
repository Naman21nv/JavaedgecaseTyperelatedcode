import java.util.*;

class Binary_Decimal_String_conversion {
    public static void main(String[] args) {
        Binary_Decimal_String_conversion obj = new Binary_Decimal_String_conversion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binaryString = sc.nextLine();
        
  

    // Method to convert binary string to decimal
    public long binary_to_decimal(String binaryString) {
        long result = 0;
        int length = binaryString.length();
        
        // Process the string from right to left (or we can reverse the power calculation)
        // For binary: rightmost bit has power 0, next has power 1, etc.
        for (int i = 0; i < length; i++) {
            char bit = binaryString.charAt(length - 1 - i); // Get character from right to left
            
            if (bit == '1') {
                result = result + (long)Math.pow(2, i);
            }
            // If bit is '0', we don't add anything to the result
        }
        
        return result;
    }
}
