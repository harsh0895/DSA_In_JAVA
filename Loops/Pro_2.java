package Loops;

//2. Write a program to find the sum of digits to the given number n

import java.util.Scanner;

public class Pro_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int sum = 0;
        while( num>0 ){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("The sum of given number is: "+sum);
    }
}
