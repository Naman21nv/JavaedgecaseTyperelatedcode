import java.util.*;




class Binary_Decimal_conversion {
    public static void main(String[] args) {
        Binary_Decimal_conversion obj = new Binary_Decimal_conversion();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int B=sc.nextInt(); 
        int decimalValue = obj.binary_to_decimal(B);
        System.out.println("The decimal value of binary " + B + " is: " + decimalValue);
    }


    public int binary_to_decimal(int B) {
        // Code here
        // 1*2^1 +0*2^0
        // 1 or 1 does matter left to ryt pow raise from 0 , for the base 2
        
        double res=0;
       int pow=0;
        
        //on the  whole it is a big number intput n is a single number 
        // 1010 means thousand ten for us 
        // if left most numebr is 0 it will ignore even it is one it will 
        // consider and do
       while(B>0){
           int last_digit=B%10;
           if(last_digit==1){
               res=res+Math.pow(2,pow);   //Math.pow() will return double 
           }
           B=B/10;
           pow++;
           
       }
       return (int)res;   //double to int casting is done here  
    }
}
