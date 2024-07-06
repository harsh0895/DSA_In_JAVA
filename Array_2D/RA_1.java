package Array_2D;

//1. Write a program how to initialize 2-D array ?

import java.util.Scanner;

public class RA_1 {
    static void print_2D_array( int [][]arr ){
        for( int i=0; i<arr.length; i++ ){
            for( int j=0; j<arr[i].length; j++ ){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      int [][]arr = { {2,3},{4,5},{6,7} };

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int column = sc.nextInt();
        int n = row * column;
        int [][]arr = new int[row][column]; // give column is not compulsory!
        System.out.println("Enter the "+n+" elements: ");
        for( int i=0; i<row; i++ ){
            for( int j=0; j<column; j++ ){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements are: ");
        print_2D_array(arr);
    }
}
