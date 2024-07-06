package Loops;

import java.util.Scanner;

// 5. Find the factorial of the given number n.

public class Pro_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your factorial number: ");
        int num = sc.nextInt();
        int fac = 1;
        for( int i=1; i<=num; i++){
            fac = fac * i;
        }
        System.out.println("The factorial is: "+fac);
    }
}
