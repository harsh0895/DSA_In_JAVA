package Loops;

public class Pro_13 {
    public static void main(String[] args) {

//        Change decimal to binary number:-
        int decimalNum = 13;
        int rem;
        int ans=0;
        int mul=1;

        while ( decimalNum>0 )
        {
            rem = decimalNum%2;
            decimalNum = decimalNum/2;
            ans = rem * mul + ans;
            mul = mul*10;
        }
        System.out.println("After converting in binary number: "+ans);
    }
}
