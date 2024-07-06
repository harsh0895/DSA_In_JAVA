package Star_Patterns;

import java.util.Scanner;

/*
 * * * * *
 * * * *
 * * *
 * *
 *
 */

public class sp_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        for( int i=1; i<=row; i++ ){
            for( int j=row; j>=i; j-- ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
