package Recursion.Loops;

// 4. Write a program to calculate power of a given number.

import java.util.Scanner;

public class rq_4 {
    static int calculatePower( int n, int power ){
        // base case
        if( power==0 ) return 1;
        return n * calculatePower(n, power-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println("Enter your power number: ");
        int pow = sc.nextInt();
        System.out.println("The power of "+num+" to the power of "+pow+" is: "+calculatePower(num, pow));

    }
}
