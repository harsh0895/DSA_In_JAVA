package Recursion.Arrays;

// 1. Write a program to print an array element in ascending or descending order.

public class rqa_1 {
    // print array elements:-
    // for ascending order
    static void printArrayRec( int []arr, int index ){
        // base case
        if( index < arr.length ){
            System.out.println(arr[index]);
            printArrayRec(arr, index + 1);
        }
    }

    // for reverse order
    static void printArr( int []arr, int index ){
        if( index==arr.length ) return;

        printArr(arr, index+1);
        System.out.println(arr[index]);
    }
    public static void main(String[] args) {
        int []arr = { 1,2,3,4,5 };
        int index = 0;
        printArrayRec(arr, index);
//        printArr(arr, index);
    }
}
