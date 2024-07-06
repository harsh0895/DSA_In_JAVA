package Star_Patterns;

import java.util.Scanner;

/*
       1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1
 */
public class sp_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows: ");
        int row = sc.nextInt();
        for( int i=1; i<=row; i++ ){
           for( int j=1; j<=i; j++ ){
               int sum = i+j;
               if( sum%2 == 0 ){
                   System.out.print(1+" ");
               }
               if( sum%2 != 0 ){
                   System.out.print(0+" ");
               }
           }
            System.out.println();
        }
    }
}
