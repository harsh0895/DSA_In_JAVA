package Array_2D;

// 6:- Write a program to print the sum of diagonal elements ?

public class RA_6 {
    static int diagonalSum(int [][]arr ){
            int sum = 0;
            int n = arr.length;

            for( int i=0; i<n; i++){
                sum = sum + arr[i][i] + arr[i][n-i-1];
            }
            return n%2==1 ? sum-arr[n/2][n/2] : sum;
    }
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        int arr[][] = { { 1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Sum is: "+diagonalSum(arr));
//        for( int i=0; i<arr.length; i++ ){
//            first += arr[i][i];
//        }
//        int i=0;
//        for( int j=2; j>=0; j-- ){
//            second = second + arr[i][j];
//            i++;
//        }
//        System.out.println("First sum: "+first);
//        System.out.println("Second sum: "+second);
    }
}
