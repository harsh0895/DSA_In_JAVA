package Binary_Search;

// 5. Given the rotated sorted array of integers, which contains distinct elements, and a target value,
//    return the index of target if it is in the array otherwise return -1.

import java.util.Scanner;

public class BS_5 {
    static int findTarget_rotatedSorted( int []arr, int target ){
        int start = 0;
        int end = arr.length-1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if( arr[mid]==target ){
                    return mid;
                }
                if( arr[mid]>=arr[start] ){
                    if( target >= arr[start] && target <= arr[mid]){
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }
                }
                else{
                    if( target>=arr[mid] && target<=arr[end] ){
                        start = mid + 1;
                    }
                    else{
                        end = mid - 1;
                    }
                }
            }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = { 3,4,5,1,2 };
        System.out.println("Enter your target element: ");
        int target = sc.nextInt();
        int index = findTarget_rotatedSorted(arr,target);
        System.out.println("target index is: "+index);

    }
}
