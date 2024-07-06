package Array_2D;

// 16. Find the rectangle sum to given matrix ?

import java.util.Scanner;

public class RA_16 {
    static void print_2D_array( int [][]arr ){
        for( int i=0; i< arr.length; i++ ){
            for( int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    // Method 1:- Brute force approach:-
    static int find_Sum( int [][]arr, int r1, int r2, int c1, int c2 ){
        int sum = 0;
        for( int i=r1; i<=r2; i++ ){
            for( int j=c1; j<=c2; j++ ){
                sum += arr[i][j];
            }
        }
        return sum;
    }
    // Method 2:- Prefix sum approach:-
    static int find_Sum_prefix( int [][]arr, int r1, int r2, int c1, int c2 ){
        int sum = 0;
        int row = arr.length;
        int col = arr[0].length;

        // calculate prefix sum matrix of each row:-
        for( int i=0; i<row; i++ ){
            for( int j=1; j<col; j++ ){
                arr[i][j] = arr[i][j] + arr[i][j-1];
            }
        }
        System.out.println("Prefix sum matrix is: ");
        print_2D_array(arr);

        // calculate sum:-
        for( int i=r1; i<=r2; i++ ){
            if( c1>=1 ){
                sum += arr[i][c2] - arr[i][c1-1];
            }
            else{
                sum += arr[i][c2];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {  // row = col = 5
                { 1,1,1,1,1 },
                { 1,1,1,1,1 },
                { 1,1,1,1,1 },
                { 1,1,1,1,1 },
                { 1,1,1,1,1 }
        };
        int r1,r2,c1,c2;
        System.out.println("Enter the value of r1: ");
        r1 = sc.nextInt();
        System.out.println("Enter the value of r2: ");
        r2 = sc.nextInt();
        System.out.println("Enter the value of c1: ");
        c1 = sc.nextInt();
        System.out.println("Enter the value of c2: ");
        c2 = sc.nextInt();
        int ans = find_Sum(arr, r1, r2, c1, c2 );
        System.out.println("The sum of rectangle is: "+ans);
        System.out.println("The sum of Rectangle is: "+find_Sum_prefix(arr,r1,r2,c1,c2));
    }
}
