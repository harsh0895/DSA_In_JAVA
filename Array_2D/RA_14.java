package Array_2D;

// 14. Write a program given a positive integer n, generate an n x n matrix filled with elements from 1 to n^2 in spiral order. ?

import java.util.Scanner;

public class RA_14 {
    static void print_2D_array( int [][]arr ){
        for( int i=0; i<arr.length; i++ ){
            for( int j=0; j<arr[i].length; j++ ){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void print_square(int [][]arr, int row, int col){
        int top = 0; // for row
        int right = col-1; // for col
        int bottom = row-1; // for row
        int left = 0; // for col
        int current = 1;
        while( current <= row*col ) {
            // print top side:-
            for (int i = left; i <= right; i++){
                arr[top][i] = current;
                current++;
            }
            top++;
            // print right side:-
            for( int j=top; j<=bottom; j++ ){
                arr[j][right] = current;
                current++;
            }
            right--;
            //print bottom side:-
            if( top<=bottom ) {
                for (int j = right; j >= left; j--) {
                    arr[bottom][j] = current;
                    current++;
                }
                bottom--;
            }
            //print left side:-
            if( left<=right ){
                for( int j=bottom; j>=top; j-- ){
                    arr[j][left] = current;
                    current++;
                }
                left++;
            }
        }
        print_2D_array(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int row = n;
        int col = n;
        int total = row * col;
        System.out.println("Total elements are: "+total);
        int [][]arr = new int[row][col];
        print_square(arr, row, col);
    }
}
