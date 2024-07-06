package Array_2D;

// 3. Write a program to search an element in array X ?

import java.util.Scanner;

public class RA_3 {
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
        System.out.println("Enter your X element: ");
        int X = sc.nextInt();
        int [][]arr = { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12} };

        System.out.println("Our Matrix is: ");
        print_2D_array(arr);

        for( int i=0; i<arr.length; i++ ){
            for( int j=0; j<arr[i].length; j++ ){
                if( arr[i][j]==X ){
                    System.out.println("your element at "+i+" row "+j+" column index..");
                    return;
                }
            }
        }
    }
}
