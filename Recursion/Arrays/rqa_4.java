package Recursion.Arrays;

// 4. Find the Maximum element in a given array of size N.

public class rqa_4 {
    static int findMaxElement(int []arr, int index ){
        if( index == arr.length-1 ) return arr[index];
        return Integer.max( arr[index], findMaxElement(arr, index + 1));
    }
    public static void main(String[] args) {
        int []arr = { 7,3,4,1,6 };
        int max = findMaxElement(arr, 0);
        System.out.println(max);
    }
}
