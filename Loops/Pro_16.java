package Loops;

import java.util.Scanner;

public class Pro_16 {
    static int countDigit( int num){
        int count = 0;
        while ( num!=0 )
        {
            num = num/10;
            count++;
        }
        return count;
    }

    static double checkArmstrong( int num, int digit ){
        double ans = 0;
        while ( num!=0 )
        {
            int rem = num%10;
            num = num/10;
            ans = Math.pow(rem, digit) + ans;
        }
        return ans;
    }
    public static void main(String[] args) {

//    Write a program to check the given number is Armstrong number or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int digit = countDigit(num);
        System.out.println("Total number of digit is: "+digit);

        double check = (int)checkArmstrong(num, digit);
        System.out.println("Total number after checking is: "+check);
        if( num == check){
            System.out.println("This is armstrong number!");
        }
        else{
            System.out.println("This is not a armstrong number!");
        }
    }
}
