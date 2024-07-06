package Binary_Search.Interview_Questions;

import java.util.Scanner;

// 1. Write a program to find the first occurrence and last occurrence of the given target element ?

public class iq_1 {
    static int leftMost(int []arr, int start, int end, int target ){
        int left = -1;
        while( start<=end ){
            int mid = start + (end - start)/2;
            if( arr[mid] == target ){
                left = mid;
                end = mid - 1;
            }
            else if( arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return left;
    }
    static int rightMost( int []arr, int start, int end, int target ) {
        int right = -1;
        while( start <= end){
            int mid = start + (end - start)/2;
            if( arr[mid] == target ){
                right = mid;
                start = mid + 1;
            }
            else if( arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return right;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = { 2,3,5,5,8,8,9 };
        int [] ans = new int[2];
        int start = 0;
        int end = arr.length - 1;
        System.out.println("Enter your target element: ");
        int target = sc.nextInt();
        int left = leftMost(arr, start, end, target);
        int right = rightMost(arr, start, end, target);
        ans[0] = left;
        ans[1] = right;
        for (int e: ans) {
            System.out.print(e+" ");
        }

    }
}
