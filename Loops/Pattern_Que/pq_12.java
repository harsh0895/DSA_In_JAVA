package Loops.Pattern_Que;

import java.util.Scanner;

public class pq_12 {

    /*

     *  *  *  *  *  *  *  *  *  *
     *  *  *  *        *  *  *  *
     *  *  *              *  *  *
     *  *                    *  *
     *                          *
     *                          *
     *  *                    *  *
     *  *  *              *  *  *
     *  *  *  *        *  *  *  *
     *  *  *  *  *  *  *  *  *  *

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        int space = 0;

        for( int i=row; i>=1; i-- ){
            for( int j=1; j<=i; j++ ){
                System.out.print(" * ");
            }
            space = 2*row - 2*i;
            for( int k=1; k<=space; k++ ){
                System.out.print("   ");
            }
            for( int R=1; R<=i; R++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for( int i=1; i<=row; i++ ){
            for( int j=1; j<=i; j++ ){
                System.out.print(" * ");
            }
            space = 2*row - 2*i;
            for( int k=1; k<=space; k++ ){
                System.out.print("   ");
            }
            for( int R=1; R<=i; R++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
