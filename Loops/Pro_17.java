package Loops;

public class Pro_17 {
    public static void main(String[] args) {

        // complement of a number:-

        int num = 13;
        int rem;
        int ans = 0;
        int mul = 1;
        while( num!=0 ){
            rem = num%2;
            rem = rem^1;
//            System.out.println(rem);
            num = num/2; 
            ans = rem * mul + ans;
            mul = mul * 2;
        }
        System.out.println("Complement is: "+ans);
    }
}
