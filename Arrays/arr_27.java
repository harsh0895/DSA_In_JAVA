package Arrays;

// 27. Write a program to rotate an array for given k steps ?

import java.util.Scanner;

public class arr_27 {
    static void print_Array( int []arr ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // with extra space:-
    static void rotateArray( int []arr, int k ){
        int n = arr.length;
        k = k % n;
        int []ans = new int[n];
        int start = 0; // 7-5 = 2
        for( int i=n-k; i<n; i++ ){
            ans[start] = arr[i];
            start++;
        }
        for( int i=0; i<n-k; i++ ){
            ans[start] = arr[i];
            start++;
        }
        System.out.println("After rotation the array is: ");
        print_Array(ans);
    }
        static int[] reverse( int []arr, int start, int end){

            while( start<end ){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            return arr;
        }
    // Without creating a new array:-
    static void Rotate( int []arr, int k ){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1 );
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        System.out.println("After Rotation array is: ");
        print_Array(arr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        int []arr = { 1,2,3,4,5,6,7 };
        System.out.println("original array is: ");
        print_Array(arr);
//        rotateArray(arr, k);
        Rotate(arr, k);
    }
}
