package Star_Patterns;

import java.util.Scanner;

/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 */

public class sp_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        for( int i=1; i<=row; i++ ){
            for( int j=i; j>=1; j-- ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
