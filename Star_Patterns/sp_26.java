package Star_Patterns;

import java.util.Scanner;

/*
 *
 * *
 * * *
 * * * *
 * * *
 * *
 *
 */

public class sp_26 {
    static void printStar( int row ){
        int star = 1;
        for( int i=1; i<=2*row-1; i++ ){
            if( star<=row ){
                for( int j=1; j<=i; j++ ){
                    System.out.print("* ");
                }
                star++;
            } else {
              for( int j=2*row-i; j>=1; j-- ){
                  System.out.print("* ");
              }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        printStar(row);
    }
}
