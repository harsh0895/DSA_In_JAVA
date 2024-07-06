package Recursion.Arrays;

// 8. Write a program to return all indexes if x element exists in the array.

import java.util.Scanner;

public class rqa_8 {
    static void printAllIndex( int []arr, int index, int target ){
        if( index == arr.length ) {
            System.out.println("Element doesn't exists!");
            return;
        }
        if( arr[index] == target ) {
            System.out.println(index);
        }

        printAllIndex(arr, index+1, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = { 1,2,3,2,2,4 };
        System.out.println("Enter your target element x: ");
        int x = sc.nextInt();
        printAllIndex(arr,0, x);
    }
}
