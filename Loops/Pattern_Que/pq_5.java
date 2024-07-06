package Loops.Pattern_Que;

import java.util.Scanner;

public class pq_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your row number: ");
        int row = sc.nextInt();

        /*
            1
            2 3
            3 4 5
            4 5 6 7
            5 6 7 8 9
         */

        for( int i=1; i<=row; i++ ){
            int value = i;
            for( int j=1; j<=i; j++){
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }
    }
}
