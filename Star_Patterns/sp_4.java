package Star_Patterns;

import java.util.Scanner;

/*
 *
 * *
 * * *
 * * * *
 * * * * *
 */

public class sp_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        System.out.println("Enter your columns: ");
        int col = sc.nextInt();
        for( int i=1; i<=row; i++ ){
            for( int j=1; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}