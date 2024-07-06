package Star_Patterns;

import java.util.Scanner;

/*
a a a
b b b
c c c
 */

public class sp_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        System.out.println("Enter your columns: ");
        int col = sc.nextInt();
        char name = 'a';
        for( int i=1; i<=row; i++ ){
            for( int j=1; j<=col; j++ ){
                System.out.print(name+" ");
            }
            name++;
            System.out.println();
        }
    }
}
