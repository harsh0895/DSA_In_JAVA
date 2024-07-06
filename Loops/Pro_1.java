package Loops;

// 1. Write a program to count the number of digits to the given number n

import java.util.Scanner;

public class Pro_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your integer number: ");
        int num = sc.nextInt();

        int count = 0;
        while( num>0 ){
            num = num/10;
            count++;
        }
        System.out.println("The total number of digits in given number is: "+count);
    }
}
