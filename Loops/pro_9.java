package Loops;

//9. Write a program to print fibonacci series to the given number n ?

import java.util.Scanner;

public class pro_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        int first = 0;
        int second = 1;
        // 0 1 1 2 3 5 8
        System.out.print(first+" "+second+" ");
        for( int i=1; i<=num; i++ ){
            int temp = first + second;
            System.out.print(temp+" ");
            first = second;
            second = temp;
        }
    }
}
