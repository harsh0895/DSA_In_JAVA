package Loops.Pattern_Que;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class pq_13 {

    /*

     *                          *
     *  *                    *  *
     *  *  *              *  *  *
     *  *  *  *        *  *  *  *
     *  *  *  *  *  *  *  *  *  *
     *  *  *  *        *  *  *  *
     *  *  *              *  *  *
     *  *                    *  *
     *                          *

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        int space = 0;
        for( int i=1; i<=row; i++ ){
            for( int j=1; j<=i; j++ ){
                System.out.print(" * ");
            }
            space = 2*row - 2*i;
            for( int k=1; k<=space; k++ ){
                System.out.print("   ");
            }
            for( int j=1; j<=i; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for( int i=row-1; i>=1; i-- ){
            for( int j=1; j<=i; j++ ){
                System.out.print(" * ");
            }
            space = 2*row - 2*i;
            for( int k=1; k<=space; k++ ){
                System.out.print("   ");
            }
            for( int j=1; j<=i; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
