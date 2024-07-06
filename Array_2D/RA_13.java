package Array_2D;

// Binary Search in 2D Array:- Array must be sorted form if you want to apply binary search in the 2D array.

import java.util.Scanner;

public class RA_13 {
    // Not a optimised Approach:- for time complexity is = ( n+log(M) ).
    static void Binary_2D( int [][]arr, int target ){
        int N = arr.length;
        int M = arr[0].length;
        int start = 0;
        int end = N*M-1;
        while( start<=end ){
            int mid = start + ( end-start )/2;
            int RI = mid / M;
            int CI = mid % M;
            if( arr[RI][CI] == target ){
                System.out.println("Your element exists at "+RI+" row "+CI+" column is: "+target);
                return;
            }
            else if( arr[RI][CI] < target ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println("your element doesn't exist!");
    }
    // This is Optimised Approach:- for time complexity is = ( log(NM) ).
    static void Optimised_2D( int [][]arr, int target ){
        int N = arr.length; //row
        int M = arr[0].length; //col
        int start = 0;
        int end = N*M-1;

        while( start<=end ){
            int mid = start + (end-start)/2;
            int ri = mid / M;
            int ci = mid % M;
            if( arr[ri][ci]==target ){
                System.out.println("Your element exists at "+ri+" row "+ci+" column is: "+target);
                return;
            }
            else if( arr[ri][ci] < target ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println("your element doesn't exist!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr = {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,11,12}
                                    };
        System.out.println("Enter your search element X: ");
        int X = sc.nextInt();
//        Binary_2D(arr, X);
        Optimised_2D(arr, X);

    }
}
