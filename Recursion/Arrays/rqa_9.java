package Recursion.Arrays;

// 9. Write a program to check an given array isSorted or not.

public class rqa_9 {
    // ascending order
    static boolean isArraySorted( int []arr, int index ){
        if( index == arr.length ){
            return true;
        }
        if( arr[index] < arr[index-1] ) {
            return false;
        }
        return isArraySorted(arr, index+1);
    }

    public static void main(String[] args) {
        int []arr = { 1,2,3,4,5,6 };
        boolean ans = isArraySorted(arr, 1);
        if( ans ){
            System.out.println("Array is sorted!");
        }
        else{
            System.out.println("Array is not sorted!");
        }
    }
}
