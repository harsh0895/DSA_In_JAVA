package Arrays;

//6. Write a program to find the last occurrence in the given array and also find the total number of occurrences to the given element X ?

import java.util.Scanner;

public class ar_6 {

    static int last_occurrence( int []arr, int x){
        int last = -1;
        for( int i=0; i<arr.length; i++){
            if( arr[i]==x ){
                last = i;
            }
        }
        return last;
    }
    static void count_occurrences( int []arr, int x ){
        int count = 0;

        for( int i=0; i<arr.length; i++ ){
            if( arr[i]==x ){
                count++;
            }
        }
        System.out.println("The total number of occurrence is: "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []arr = {5,6,5,1,5,6};
        System.out.println("Enter your element: ");
        int x = sc.nextInt();
        count_occurrences(arr, x);
        System.out.println("The last occurrence of element x is: "+last_occurrence(arr, x));

    }
}
