package Recursion.Arrays;

// Linear Search:-
// 7. Write a program to print whether x exists in the array or not.

import java.util.Scanner;

public class rqa_7 {
    static boolean checkX( int []arr, int index, int x ){
        // base case
        if( index == arr.length ){
            return false;
        }
        // self work
        if( arr[index] == x ){
            return true;
        }
        // recursive work
        return checkX(arr,index+1, x);
    }

    // in this case if element exists return element index otherwise return -1.
    static int checkXI( int []arr, int index, int x ){
        // base case
        if( index == arr.length ){
            return -1;
        }
        // self work
        if( arr[index] == x ){
            return index;
        }
        // recursive work
        return checkXI(arr,index+1, x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = { 1,2,3,4,5,6,7,8 };
        System.out.println("Enter your target element x: ");
        int x = sc.nextInt();

//        boolean exist = checkX(arr, 0, x);
//        System.out.println("element exists: "+exist);

        int ans = checkXI(arr, 0, x);
        if( ans > -1){
            System.out.println("Element exist on "+ans+" index!");
        }else{
            System.out.println("Element doesn't exists!");
        }
    }
}
