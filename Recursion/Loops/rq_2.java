package Recursion.Loops;

import java.util.Scanner;

// 2. Write a program to calculate the factorial of n number.

public class rq_2 {
    static int factorial( int n ){
        if( n==1 || n==0 ){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of "+num+" is: "+factorial(num));
    }
}
