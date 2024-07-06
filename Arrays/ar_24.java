package Arrays;

//24. For a given array of integers of size n, answer q queries to print the sum of values in a given range of indices from l to r ?
    // Array should be 1-based indexing!

import java.util.Scanner;

public class ar_24 {
    static void print_array( int []arr ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] prefix_sum( int []arr ){

        for( int i=1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
//        System.out.println("Prefix sum array is: ");
//        print_array(arr);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n+1];
        System.out.println("Enter "+n+" elements: ");
        for( int i=1; i<=n; i++ ){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array is: ");
        print_array(arr);

        int sumPre[] = prefix_sum(arr);
        System.out.println("Prefix sum array is: ");
        print_array(sumPre);

        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();
        while( q-- > 0 ){
            System.out.println("Enter range l to r: ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = sumPre[r] - sumPre[l-1];
            System.out.println("Sum is: "+sum);
        }

    }
}
