package Recursion.Loops;

// 3. Write a program to print sum of N number.

import java.util.Scanner;

public class rq_3 {
    static int sum(int n){
        // base case
        if( n==0 ) return 0;
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println("Sum of "+num+" numbers is: "+sum(num));
    }
}
