package Loops;

import java.util.Scanner;

//8. Write a program to check the given number is prime or not.

public class Pro_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        for( int i=2; i<num; i++ ){
            if( num%i==0 ){
                System.out.println("Not a prime number!");
            }
            else{
                System.out.println("your number is prime");
            }
        }
    }
}
