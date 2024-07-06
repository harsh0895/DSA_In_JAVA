package Recursion.Loops;

import java.util.Scanner;

// 8. Write a program to find GCD and LCM of two numbers by applying Euclid's algorithm.

public class rq_8 {
    static int findGCD( int n1, int n2 ){
        // base case
        if( n2==0 ) return n1;
        // Euclid's algorithm
        return findGCD(n2, n1 % n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int n2 = sc.nextInt();
        int GCD = findGCD(n1, n2);
        int LCM = (n1*n2) / GCD;
        System.out.println("GCD is: "+GCD);
        System.out.println("LCM is: "+LCM);
    }
}
