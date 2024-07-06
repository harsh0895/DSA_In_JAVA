package Loops;

// 18. Write a program for converting a binary number character array into the decimal number !

public class Pro_18 {
    public static void main(String[] args) {
        char []binary = { '1', '1', '0', '1' };
        int ans = 0;
        int mul = 1;

        for( int i = binary.length-1; i >= 0; i-- ) {
            int rem = binary[i] - '0';
            ans = rem * mul + ans;
            mul = mul * 2;
        }

        System.out.println("Decimal number is: "+ans);
    }
}
