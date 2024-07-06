package Star_Patterns;

import java.util.Scanner;

/*
a
b b
c c c
d d d d
e e e e e
 */

public class sp_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        char name = 'a';
        for( int i=1; i<=row; i++ ){
            for( int j=1; j<=i; j++ ){
                System.out.print(name+" ");
            }
            name++;
            System.out.println();
        }
    }
}
