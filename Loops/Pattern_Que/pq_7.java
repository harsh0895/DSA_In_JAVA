package Loops.Pattern_Que;

import java.util.Scanner;

public class pq_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your rows: ");
        int row = sc.nextInt();

        /*
             *
            **
           ***
          ****
         *****
         */

        for( int i=1; i<=row; i++){
            int space = row - i;

            // print space
            for( int j=1; j<=space; j++){
                System.out.print(" ");
            }

            // print star
            for( int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
