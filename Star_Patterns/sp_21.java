package Star_Patterns;

import java.util.Scanner;

/*
 *             *
 * *         * *
 * * *     * * *
 * * * * * * * *
 * * *     * * *
 * *         * *
 *             *
 */

public class sp_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        // upper
        for( int i=1; i<=row; i++ ){
            // left upperStars
            for(int j=1; j<=i; j++ ){
                System.out.print("* ");
            }
            // space
            int space = 2 * (row - i);
            for( int k=1; k<=space; k++){
                System.out.print("  ");
            }
            // print star right side
            for(int j=1; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        // bottom
        for( int i=1; i<=row; i++ ){
            // print star left side
            for( int j=row-i; j>=1; j-- ){
                System.out.print("* ");
            }
            // space
            int space = 2*i;
            for( int k=1; k<=space; k++ ){
                System.out.print("  ");
            }
            // print star right side
            for( int j=row-i; j>=1; j-- ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
