package Imp_Algo;

// Implement binary search algorithm!


import java.util.Scanner;

public class Binary_Search {
    // Binary Search without recursion
    static int binarySearch( int []arr, int k ) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while( start <= end ) {
            int mid = start + ( end -start )/2;
            if( arr[mid] == k ) return mid;
            if( arr[mid] < k ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    // Using Recursion
    static int binaryRec(int []arr, int target, int start, int end){
        // base case
        if (start <= end) {
            int mid = start + (end - start) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == target)
                return mid;

            // If element is smaller than mid, then it can only be present in left subarray
            if (arr[mid] < target)
                return binaryRec(arr, target, mid + 1, end);

            // Else the element can only be present in right subarray
            return binaryRec(arr, target, start, mid - 1);
        }

        // We reach here when the element is not present in the array
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = { 2,3,4,4,5,6,7 };
        System.out.println("Enter your element: ");
        int k = sc.nextInt();
//        int index = binarySearch(arr, k);
        int index = binaryRec(arr,k, 0, arr.length-1);

        System.out.println(index != -1 ? "Element at " + index + " index in your array!" : "Element does not exist!");

    }
}
