package Binary_Search;

// 8. Write a program to find the ceiling of a number ?

import java.util.Scanner;

public class BS_8 {
    static int ceiling_Number( int []arr, int target ){
        // if the target element is greater than the greatest element in the given array so will return -1!
        if( target>=arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while( start<=end ){
            int mid = start + (end-start)/2;
            if( arr[mid]==target ){
                return arr[mid];
            }
            else if( arr[mid]<target ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []arr = { 2,3,5,9,14,16,18 };
        System.out.println("Enter your target element: ");
        int target = sc.nextInt();
//        int start = 0;
//        int end = arr.length-1;
//        int ans = -1;
//        while( start<=end ){
//            int mid = start+(end-start)/2;
//            if( arr[mid]==target ){
//                ans = arr[mid];
//                break;
//            }
//            else if( arr[mid]<target ){
//                start = mid + 1;
//            }
//            else{
//                end = mid - 1;
//            }
//        }
//        if( ans == -1 ){
//            for( int i=0; i<arr.length; i++ ){
//                if( target<arr[i]){
//                    ans = arr[i];
//                    System.out.println("Your ceiling number is: "+ans);
//                    break;
//                }
//            }
//        }else{
//            System.out.println("Your target number exists so your ceiling number is: "+ans);
//        }

        System.out.println("Ceiling number is: "+ceiling_Number(arr, target));
    }
}
