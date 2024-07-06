package Binary_Search;

import java.util.Scanner;

public class Algorithm {
    // Implement Binary Search in an Array:-
    // when array is sorted in Ascending order:-
    static int binarySearch( int []arr, int n, int key){
        int start = 0;
        int end = n-1;
        int mid;

        while( start<=end ){
            mid = start + (end - start)/2;
            if( arr[mid] == key ){
                return mid;
            }
            else if( arr[mid]<key ) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    // when array is sorted in descending order:-
    static int bs_dec( int []arr, int n, int key){
        int start = 0;
        int end = n-1;
        int mid;

        while( start<=end ){
            mid = start + (end-start)/2;
            if( arr[mid]==key){
                return mid;
            }
            else if( arr[mid]>key ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = { 4,6,10,12,14 };
//        int arr[] = { 10,8,6,4,2 };
        int n = arr.length;


        System.out.println("Enter your key: ");
        int key = sc.nextInt();

        int ans = binarySearch(arr, n, key);
//        int ans = bs_dec(arr, n, key);
        if( ans==-1){
            System.out.println("your element not in the array!");
        }
        else {
            System.out.println("your element index is: "+ans);
        }

    }
}
