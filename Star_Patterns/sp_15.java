package Star_Patterns;

import java.util.Scanner;

/*
        A
      A B
    A B C
  A B C D
A B C D E
 */

public class sp_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        char ch = 'A';
        for( int i = 1; i <= row; i++) {
            int space = row - i;
            for( int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for( int k = 1; k <= i; k++ ){
                System.out.print(ch+" ");
                ch++;
            }
            ch = 'A';
            System.out.println();
        }
    }
}
