package Binary_Search;

// 3. Write a program to find first and last occurrence of the given target element in the array, if the target element are not present returns [-1,-1] .

import java.util.Scanner;

public class BS_3 {
    static void print_Array( int []arr ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1,2,2,3,3,3,4,5,11 };
        System.out.println("Array elements are: ");
        print_Array(arr);
        System.out.println("Enter your target element: ");
        int target = sc.nextInt();

        // find first occ:-
        int start = 0;
        int end = arr.length-1;
        int first = -1;
        while( start<=end ){
            int mid = start + (end-start)/2;
            if( arr[mid] == target ){
                first = mid;
                end = mid - 1;
            }
            else if( arr[mid]<target ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        // find last occ:-
        int last = -1;
        int s = 0;
        int e = arr.length-1;
        while( s<=e ){
            int mid = s + (e-s)/2;
            if( arr[mid]==target ){
                last = mid;
                s = mid + 1;
            }
            else if( arr[mid]<target ){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        int []ans = { first,last };
        print_Array(ans);

    }
}
