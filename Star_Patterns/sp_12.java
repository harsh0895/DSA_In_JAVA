package Star_Patterns;

import java.util.Scanner;

/*
         *
       * *
     * * *
   * * * *
 * * * * *
 */

public class sp_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        for( int i=1; i<=row; i++ ){
            // print space
            int space = row - i;
            for( int j=1; j<=space; j++ ){
                System.out.print("  ");
            }
            // print stars
            for( int k=1; k<=i; k++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
