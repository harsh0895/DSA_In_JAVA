package Recursion.Loops;

// 6. Write a program to print given fibonacci number.

import java.util.Scanner;

public class rq_6 {
    static int findFibNumber( int n ){
        if( n==1 || n==0 ) return n;
        return findFibNumber(n-1) + findFibNumber(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        // 0 1 1 2 3 5 8 13 21
        System.out.println("Fibonacci number is: "+findFibNumber(num));
    }
}
