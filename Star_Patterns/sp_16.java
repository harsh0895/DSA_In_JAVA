package Star_Patterns;

import java.util.Scanner;

/*
        1
      2 1
    3 2 1
  4 3 2 1
5 4 3 2 1
 */

public class sp_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        for( int i=1; i<=row; i++ ){
            int space = row - i;
            for( int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for( int k=i; k>=1; k-- ){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
