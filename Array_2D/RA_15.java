package Array_2D;

import java.util.Scanner;

// 15. Return n rows of Pascal's triangle ?
public class RA_15 {
    static void print_2D_array( int [][]arr ){
        for( int i=0; i< arr.length; i++ ){
            for( int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number n: ");
        int n = sc.nextInt();
        int [][]arr = new int[n][];
        for( int i=0; i<n; i++ ){
            // initialize number of columns:-
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i] = 1;
            for( int j=1; j<i; j++ ){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        print_2D_array(arr);
    }
}
