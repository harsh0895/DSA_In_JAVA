package Recursion.Loops;

import java.util.Scanner;

// 11. Write a program Given a number n, find the sum of natural numbers till n but with alternate signs.

public class sq_11 {
    static int alternateSumOfSeries( int num ){
        if( num == 0 ){
            return 0;
        }
        if( num % 2 == 0 ){
            return alternateSumOfSeries(num-1) - num;
        }
        else {
            return alternateSumOfSeries(num - 1) + num;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int sum = alternateSumOfSeries(num);
        System.out.println("The sum is: "+sum);
    }
}
