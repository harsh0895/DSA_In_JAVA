package Star_Patterns;

import java.util.Scanner;

/*
1 2 3
4 5 6
7 8 9
 */

public class sp_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        System.out.println("Enter your columns: ");
        int col = sc.nextInt();
        int count = 1;
        for( int i=1; i<=row; i++ ){
            for( int j=1; j<=col; j++ ){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
