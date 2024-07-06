package Star_Patterns;

import java.util.Scanner;

// diamond pattern
/*
       *
     * * *
   * * * * *
 * * * * * * *
 * * * * * * *
   * * * * *
     * * *
       *
 */
public class sp_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        // upper side
        for( int i=1; i<=row; i++ ){
            // print space
            int space = row-i;
            for( int j=1; j<=space; j++ ){
                System.out.print("  ");
            }
            // print stars
            int stars = 2 * i - 1;
            for( int k=1; k<=stars; k++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        // bottom side
        for( int i=row; i>=1; i-- ){
            // print space
            int space = row - i;
            for( int j=1; j<=space; j++ ){
                System.out.print("  ");
            }
            // print stars
            int stars = 2*i-1;
            for( int k=1; k<=stars; k++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
