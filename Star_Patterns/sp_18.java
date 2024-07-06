package Star_Patterns;

import java.util.Scanner;

/*
        1
      1 2 1
    1 2 3 2 1
 */

public class sp_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        for( int i=1; i<=row; i++ ){
            int space = row - i;
            for( int j=1; j<=space; j++ ){
                System.out.print("  ");
            }
            // first half
            for( int k=1; k<=i; k++ ){
                System.out.print(k+" ");
            }
            // second half
            for( int r=i-1; r>=1; r-- ){
                System.out.print(r+" ");
            }
            System.out.println();
        }
    }
}
