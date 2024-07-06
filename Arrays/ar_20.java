package Arrays;

//20. Write a program to sort an array which only consisting of 0's and 1's ?

import java.util.Scanner;

public class ar_20 {
    static void print_array( int arr[] ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int []arr = { 0,1,1,0,0,1 };
        int []arr = new int[6];
        for( int i=0; i<arr.length; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println("array before sorting: ");
        print_array(arr);

        int i=0;
        int j = arr.length - 1;

        while( i < j ){

            if( arr[i] == 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
         if( arr[i] == 0 ){
             i++;
         }
         if( arr[j] == 1){
             j--;
         }

        }
        System.out.println("array after sorting: ");
        print_array(arr);

    }
}
