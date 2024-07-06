package Loops.Pattern_Que;

import java.util.Scanner;

public class pq_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();


        for( int i=1; i<=row; i++){

            // print numbers
            for( int j=1; j<=row-i+1; j++){
                System.out.print(j+" ");
            }

            // print star
            for( int k=2; k<=i; k++){
                System.out.print("*"+" ");
            }

            //print star
            for( int k=2; k<=i; k++){
                System.out.print("*"+" ");
            }

            // print number
            for( int j=row-i+1; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
