package Star_Patterns;

import java.util.Scanner;

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

public class sp_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        for( int i=row; i>=1; i-- ){
            for( int j=1; j<=i; j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
