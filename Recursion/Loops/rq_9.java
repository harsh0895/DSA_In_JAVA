package Recursion.Loops;

// 9. Write a program to find out the sum of its digits using recursion.

import java.util.Scanner;

public class rq_9 {
    static int sumOfDigits( int n ){
        if( n==0 ){
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your digit: ");
        int digits = sc.nextInt();
        int sum = sumOfDigits(digits);
        System.out.println("The sum of digits is: "+sum);
    }
}
