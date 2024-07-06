package Recursion.Arrays;

// 5. Find the Product of all elements in a given array of size N.

public class rqa_5 {
    static int findProduct( int []arr, int index ){
        // base case
        if( index == arr.length ) return 1;
        return arr[index] * findProduct(arr, index + 1);
    }
    public static void main(String[] args) {
        int []arr = { 2,3,4 };
        int product = findProduct(arr, 0);
        System.out.println("The product of all element is: "+product);
    }
}
