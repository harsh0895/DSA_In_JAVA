package Recursion.Arrays;

// 3. Write a program to find minimum element in the given array.

public class rqa_3 {
    static int findMinElement(int []arr, int index ){
        // base case
        if( index == arr.length-1 ) {
            return arr[index];
        }
        int min = Integer.min(arr[index], findMinElement(arr, index + 1));
        return min;
    }
    public static void main(String[] args) {
        int []arr = { 7,3,4,1,6 };
        int min = findMinElement(arr, 0);
        System.out.println(min);
    }
}
