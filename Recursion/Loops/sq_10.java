package Recursion.Loops;

// 10. Write a program to Given a number num and a value k, print k multiples of num.

import java.util.Scanner;

public class sq_10 {
    static void printMultiple( int num, int k ){
        if( k == 0 ) return;
//        System.out.println(num*k);
        printMultiple(num, k-1);
        System.out.println(num*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println("Enter your k multiples: ");
        int K = sc.nextInt();
        printMultiple(num, K);
    }
}
