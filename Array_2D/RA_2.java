package Array_2D;

//2. Write a program to calculate addition of two matrices ?

import java.util.Scanner;

public class RA_2 {
    static void print_2D_array( int [][]arr ){
        for( int i=0; i< arr.length; i++ ){
            for( int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void addition_of_twoMatrices( int [][]arr, int [][]arr2, int row, int col, int row2, int col2 ){
        if( row!=row2 || col!=col2 ){
            System.out.println("Wrong input - Addition not possible!");
            return;
        }

        int [][]Sum = new int[row][col];

        for( int i=0; i<row; i++ ){
            for( int j=0; j<col; j++ ){
                Sum[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        System.out.println("The sum of two matrices is: ");
        print_2D_array(Sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows of arr: ");
        int row1 = sc.nextInt();
        System.out.println("Enter the number of columns of arr: ");
        int column1 = sc.nextInt();
        int [][]arr = new int[row1][column1];
        System.out.println("Enter the "+row1*column1+" elements of arr: ");
        for( int i=0; i<row1; i++ ){
            for( int j=0; j<column1; j++ ){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("First Matrix is: ");
        print_2D_array(arr);

        System.out.println("Enter the number of rows of arr2: ");
        int row2 = sc.nextInt();
        System.out.println("Enter the number of columns of arr2: ");
        int column2 = sc.nextInt();
        int [][]arr2 = new int[row2][column2];
        System.out.println("Enter the "+row2*column2+" elements of arr: ");
        for( int i=0; i<row2; i++ ){
            for( int j=0; j<column2; j++ ){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Second Matrix is: ");
        print_2D_array(arr2);

        addition_of_twoMatrices(arr, arr2, row1, column1, row2, column2);

    }
}
