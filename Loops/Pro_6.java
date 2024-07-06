package Loops;

// 6. Given two numbers a and b and find a raise to the power b ?

public class Pro_6 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int ans = 1;
        for ( int i=1; i<=b; i++){
            ans = ans * a;
        }
        System.out.println("The "+a+" to the power "+b+" is: "+ans);
    }
}
