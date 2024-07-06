package Array_2D;

//4. Write a program to calculate multiplication of two matrices ?

import java.util.Scanner;

public class RA_4 {
    static void print_2D_array( int [][]arr ){
        for( int i=0; i< arr.length; i++ ){
            for( int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void multiplication( int [][]a, int r1, int c1, int [][]b, int r2, int c2 ){
        if( c1!=r2 ){
            System.out.println("Wrong Input - Multiplication not possible!");
            return;
        }
        int [][]multiply = new int[r1][c2];

        for( int i=0; i<r1; i++ ){
            for( int j=0; j<c2; j++ ){
                for( int k=0; k<c1; k++){
                    multiply[i][j] = multiply[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows of arr: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns of arr: ");
        int c1 = sc.nextInt();
        int [][]arr = new int[r1][c1];
        System.out.println("Enter the "+r1*c1+" elements of arr: ");
        for( int i=0; i<r1; i++ ){
            for( int j=0; j<c1; j++ ){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("First Matrix is: ");
        print_2D_array(arr);

        System.out.println("Enter the number of rows of arr2: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of columns of arr2: ");
        int c2 = sc.nextInt();
        int [][]arr2 = new int[r2][c2];
        System.out.println("Enter the "+r2*c2+" elements of arr: ");
        for( int i=0; i<r2; i++ ){
            for( int j=0; j<c2; j++ ){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Second Matrix is: ");
        print_2D_array(arr2);

        multiplication( arr, r1, c1, arr2, r2, c2);
    }
}
