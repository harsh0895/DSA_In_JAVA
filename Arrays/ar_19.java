package Arrays;

//19. Rotate the given array 'arr' by k steps, without using extra space and where k is non-negative. k can be greater than n as well ?

import java.util.Scanner;

public class ar_19 {
    static void print_array( int arr[] ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reverse( int []arr, int start, int end ){

        while( start<=end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotate_arr( int []arr, int k){
        int n = arr.length;
        k = k % n;

        // print rotate value
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        print_array(arr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        int arr[] = { 1,2,3,4,5,6 };
        System.out.println("Original array is: ");
        print_array(arr);

        rotate_arr(arr, k);

    }
}
