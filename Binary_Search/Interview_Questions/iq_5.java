package Binary_Search.Interview_Questions;

import java.util.Scanner;

public class iq_5 {
    static int findRangeOfArray( int []arr, int target ) {
        int start = 0;
        int end = 1;
        while ( arr[end] <= target ) {
            int newStart = end + 1;
            if( arr[end] < target ) {
                end = end + (end - start + 1) * 2; // end = 1 + ( 1- 0 + 1) * 2 = 1 + 4 = 5
                start = newStart; // start = 2
            }
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch( int []arr, int target, int start, int end ) {
        while( start <= end ) {
            int mid = start + ( end - start )/2;
            if( arr[mid] == target ) {
                return mid;
            }
            else if ( arr[mid] < target ) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = { 1,2,5,7,8,10,12,13,15,17,19,21,23,25,27,30 };
        System.out.println("Enter your target element: ");
        int target = sc.nextInt();
        int ans = findRangeOfArray(arr, target);
        System.out.println("Your target element index is: "+ans);
    }
}
