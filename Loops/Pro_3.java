package Loops;

// 3.Write a program to reverse the digits of the given number n

import java.util.Scanner;

public class Pro_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        System.out.println("The original number is: "+num);
        int rev = 0;
        while( num>0 ){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("The reverse number is: "+rev);
    }
}
