package Recursion.Loops;

// 5. Write a program to print sum of square of N number.

import java.util.Scanner;

public class rq_5 {
    static int sumOfSquare( int n) {
        if( n==1 ) return 1;
        return n*n + sumOfSquare(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println("Sum of square of "+num+" numbers is: "+sumOfSquare(num));
    }
}
