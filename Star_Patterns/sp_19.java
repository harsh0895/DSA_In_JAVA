package Star_Patterns;

import java.util.Scanner;

/*
 * * * * *
   * * *
     *
 */

public class sp_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        for( int i=1; i<=row; i++ ){
            int space = i - 1;
            for( int j=1; j<=space; j++ ){
                System.out.print("  ");
            }
            int star = (2*row) - (2*i-1);
            for( int j=1; j<=star; j++ ){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
