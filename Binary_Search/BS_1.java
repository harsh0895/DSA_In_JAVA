package Binary_Search;

// 1. Write a program to find the index of first occurrence of the target element in the given sorted array .

import java.util.Scanner;

public class BS_1 {
    static void print_Array( int []arr ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int find_Occ( int []arr, int target ){
        int start = 0;
        int end = arr.length-1;
        int mid;
        int index = -1;
        while ( start<=end ){
            mid = start + ( end-start )/2;
            if( arr[mid]==target ){
                index = mid;
                end = mid - 1;
            }
            else if( arr[mid]<target ){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = { 5,5,5,5,6,6,8,9,9 };
        System.out.println("Array elements are: ");
        print_Array(arr);
        System.out.println("Enter your target element: ");
        int target = sc.nextInt();
        System.out.println("Index is: "+find_Occ(arr,target));

    }
}
