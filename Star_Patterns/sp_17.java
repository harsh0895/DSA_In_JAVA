package Star_Patterns;

import java.util.Scanner;

// Pyramid patten program
/*
       *
     * * *
   * * * * *
 * * * * * * *
 */

public class sp_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        for( int i=1; i<=row; i++ ){
            int space = row - i;
            for( int j=1; j<=space; j++){
                System.out.print("  ");
            }
            int star = 2 * i - 1; // 2*1-1=2-1=1
            for( int k=1; k<=star; k++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
