package Arrays;

// 17. Rotate the given array 'arr' by k steps, where k is non-negative. k can be greater than n as well ?

import java.util.Scanner;

public class ar_17 {
    static void print_array( int arr[] ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] rotate( int []arr, int k ){
        int n = arr.length;
        k = k % n;  // 2%5 = 2
        int ans[] = new int[n];
        int j=0;

        for( int i=n-k; i<arr.length; i++){
            ans[j++] = arr[i];
        }

        for( int i=0; i<n-k; i++ ){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        int arr[] = { 1,2,3,4,5 };
        System.out.println("Original array is: ");
        print_array(arr);

        int ans[] = rotate(arr, k);
        System.out.println("array after rotation is: ");
        print_array(ans);
    }
}
