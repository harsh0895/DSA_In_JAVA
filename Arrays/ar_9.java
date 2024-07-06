package Arrays;

//9. Write a program to return an array and return smallest and largest element in the ans array ?

import java.util.Arrays;

public class ar_9 {
    static int [] smallest_and_largest( int arr[] ){
        Arrays.sort(arr); // it will sort an array element 1 2 3 5 6...
        int largest = arr[arr.length-1];
        int smallest = arr[0];
        int []arr2 = {smallest, largest};
        return arr2;
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,5,6,3};
        int ans[] = smallest_and_largest(arr);
        System.out.println("Smallest element: "+ans[0]);
        System.out.println("largest element: "+ans[1]);
    }
}
