package Loops;

import java.util.Scanner;

public class pro_11 {
    public static void main(String[] args) {

// Write a program to find given fibonacci number ?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your fibonacci number: ");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        int current = 0;
        for( int i=0; i<num-2; i++){
            current = first + second;
            first = second;
            second = current;
        }
        System.out.println("Current number is: "+current);
    }
}
