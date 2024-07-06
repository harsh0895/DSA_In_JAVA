package Star_Patterns;

import java.util.Scanner;

/*
 * * * * * * * *
 * * *     * * *
 * *         * *
 *             *
 *             *
 * *         * *
 * * *     * * *
 * * * * * * * *
 */

public class sp_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        // upper half
        for( int i=row; i>=1; i-- ){
            // print star upperLeft
            for( int j=1; j<=i; j++ ){
                System.out.print("* ");
            }
            int space = 2 * (row - i);
            for( int j=1; j<=space; j++ ){
                System.out.print("  ");
            }
            // print star upperRight
            for( int k=1; k<=i; k++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for( int i=1; i<=row; i++ ){
            // print left star
            for( int j=1; j<=i; j++ ){
                System.out.print("* ");
            }
            int space = 2 * row - 2 * i;
            for( int k=1; k<=space; k++ ){
                System.out.print("  ");
            }
            // print right star
            for( int r=1; r<=i; r++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
