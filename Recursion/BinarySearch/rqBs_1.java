package Recursion.BinarySearch;

// Binary Search using recursion
// 1. Write a program to search an element using binary search in recursion if x is found return x index otherwise return -1;

import java.util.Scanner;

public class rqBs_1 {
    static int searchElement(int []arr, int start, int end, int x) {
        // base case
        if( start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if( arr[mid] == x ){
            return mid;
        }
        else if( arr[mid] < x ){
            return searchElement(arr, mid + 1, end, x);
        }
        else{
            return searchElement(arr, start, mid - 1, x);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = { 1,2,3,4,5 };
        System.out.println("Enter your element: ");
        int x = sc.nextInt();
        int ans = searchElement(arr, 0, arr.length-1, x);
        System.out.println( ans != -1 ? "your element found at "+ans+" index" : "element not found!");
    }
}
