package Star_Patterns;

/*
         1
        212
       32123
      4321234
       32123
        212
         1
 */

import java.util.Scanner;

public class sp_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        // upper side
        for( int i=1; i<=row; i++ ){
            int space = row - i;
            for( int j=1; j<=space; j++ ){
                System.out.print(" ");
            }
            // print digit
            for( int k=i; k>=1; k-- ){
                System.out.print(k);
            }
            for( int r=2; r<=i; r++ ){
                System.out.print(r);
            }
            System.out.println();
        }
        // lower side
        for( int i=row-1; i>=1; i-- ){
            int space = row - i;
            for( int k=1; k<=space; k++ ){
                System.out.print(" ");
            }
            for( int j=i; j>=1; j-- ){
                System.out.print(j);
            }
            for( int r=2; r<=i; r++ ){
                System.out.print(r);
            }
            System.out.println();
        }
    }
}
