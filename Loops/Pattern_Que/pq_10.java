package Loops.Pattern_Que;

import java.util.Scanner;

public class pq_10 {
    /*
                *
             *  *  *
           *  *  *  *  *
        *  *  *  *  *  *  *
     *  *  *  *  *  *  *  *  *
     */
    static void printEasyMethod( int row){
        int space = 0;
        for( int i=1; i<=row; i++ ) {
            space = row - i;
//            print space:-
            for (int j = 1; j <= space; j++) {
                System.out.print("   ");
            }
//            print star:-
            int star = 2 * i - 1;
            for (int k = 1; k <= star; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //        In Reverse order:-

    static void ReverseOrder( int row ){
        int space = 0;
        for( int i=row; i>=1; i-- ) {
            space = row - i;
//            print space:-
            for (int j = 1; j <= space; j++) {
                System.out.print("   ");
            }
//            print star:-
            int star = 2 * i - 1;
            for (int k = 1; k <= star; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows; ");
        int row = sc.nextInt();
        int space = 0;

        for( int i=1; i<=row; i++ ){
            space = row-i;
            for( int j=1; j<=space; j++ ){
                System.out.print("   ");
            }
            for( int k=1; k<=i; k++ ){
                System.out.print(" * ");
            }
//            print right side star:-
            for( int r=2; r<=i; r++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }

        printEasyMethod(row);
        ReverseOrder(row);
    }
}
