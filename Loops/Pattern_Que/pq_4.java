package Loops.Pattern_Que;

import java.util.Scanner;

public class pq_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();

        /*
            1
            2 3
            4 5 6
            7 8 9 10

         */
        int num = 1;
        for( int i=1; i<=row; i++){
            for( int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
