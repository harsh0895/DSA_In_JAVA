package Star_Patterns;

import java.util.Scanner;

/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
 */

public class sp_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        for( int i=row; i>=1; i--){
            for( int j=row; j>=i; j-- ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
