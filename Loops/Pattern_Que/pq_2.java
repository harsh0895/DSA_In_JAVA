package Loops.Pattern_Que;

import java.util.Scanner;

public class pq_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();

        /*
            1 2 3
            4 5 6
            7 8 9
         */

        int count = 1;

        for ( int i=1; i<=row; i++){
            for( int j=1; j<=col; j++ ){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
