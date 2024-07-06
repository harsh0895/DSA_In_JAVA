package Recursion.Arrays;

// 10. Write a program to print last index of the target element.

import java.util.Scanner;

public class rqa_10 {
    static int findLastIndex( int []arr, int index, int target ){
        if( index < 0 ){
            return -1;
        }

        if( arr[index] == target ){
            return index;
        }

        return findLastIndex(arr, index-1, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = { 1,2,3,2,2,4 };
        int x = 2;
        int ans = findLastIndex(arr, arr.length-1, x);
        if( ans > -1){
            System.out.println("Last element exist on "+ans+" index!");
        }else{
            System.out.println("Element doesn't exists!");
        }
    }
}

