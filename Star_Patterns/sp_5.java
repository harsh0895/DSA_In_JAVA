package Star_Patterns;

import java.util.Scanner;

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

public class sp_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        for( int i=1; i<=row; i++ ){
            for( int j=1; j<=i; j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
