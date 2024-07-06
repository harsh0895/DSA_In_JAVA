package Binary_Search;

// 9. Write a program to find the floor of a number ?

import java.util.Scanner;

public class BS_9 {
    static int floor_Number( int []arr, int target ){
        // if the target element is smaller than the smallest element in the given array so will return -1!
        if( target<arr[0]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;
        while( start<=end ){
            int mid = start + (end-start)/2;
            if( arr[mid]==target ){
                return arr[mid];
            }
            else if( arr[mid]<target ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[end];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = { 2,3,5,9,14,16,18 };
        System.out.println("Enter your target element: ");
        int target = sc.nextInt();
        System.out.println("Floor number is: "+floor_Number(arr,target));
    }
}
