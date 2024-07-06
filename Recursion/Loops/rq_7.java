package Recursion.Loops;

// 7. Write a program to print fibonacci series from 0 to N numbers.

import java.util.Scanner;

public class rq_7 {
    static void fibSeries( int first, int second, int n ){
        int sum = first + second;
        // base case
        if( n < sum ) return;
        // 0 1 1 2 3 5 8 13 21.......
        System.out.println(sum);
        first = second;
        second = sum;
        fibSeries(first, second, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        fibSeries(first, second, num);
    }
}
