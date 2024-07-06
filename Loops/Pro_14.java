package Loops;

public class Pro_14 {
    public static void main(String[] args) {

//        Binary to decimal:-
        int binaryNum =1101;

        int rem;
        int ans = 0;
        int mul=1;
        while ( binaryNum>0 )
        {
            rem = binaryNum%10;
            binaryNum = binaryNum/10;
            ans = rem * mul + ans;
            mul = mul * 2;
        }
        System.out.println("decimal number is: "+ans);
    }
}
