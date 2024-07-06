package Loops.Pattern_Que;

import java.util.Scanner;

public class pq_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your rows: ");
        int row = sc.nextInt();

        /*
            1
            2 1
            3 2 1
            4 3 2 1
            5 4 3 2 1
         */

        for( int i=1; i<=row; i++){
            for( int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
