package Binary_Search;

// Implement binary search using recursion:-

import java.util.Scanner;

public class BS_7 {
    static void print_Array( int []arr ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // binary search:-
    static boolean find_target( int[]arr, int start, int end, int target ){
        // base case:-
        if( start>end ){
            return false;
        }
        int mid = start + (end-start)/2;
        if( arr[mid]==target ){
            return true;
        }
        else if( arr[mid]<target ){
           return find_target(arr,mid+1, end, target);
        }
        else{ // if(arr[mid]>target)
            return find_target(arr, start, mid-1, target);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []arr = { 2,4,5,6,8,9,12,15 };
        System.out.println("Enter your target: ");
        int target = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        System.out.println("Target exist: "+find_target(arr, start, end, target));

    }
}
