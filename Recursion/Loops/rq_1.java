package Recursion.Loops;

import java.util.Scanner;

// 1. Write a program to print 1 to N numbers ascending as well as descending.

public class rq_1 {
    // print ascending order
    static void print( int n ){
        // base case
        if( n==0 ) return;
        print(n - 1);
        System.out.println(n);
    }

    // print descending order
    static void printDec( int n ){
        // base case
        if( n==0 ) return;
        System.out.println(n);
        printDec(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
//        print(num);
        printDec(num);
    }
}
