package Recursion.Arrays;

// 2. Write a program to calculate sum of all elements given in the array.

public class rqa_2 {
    static int sumOfElements( int []arr, int index ){
        int sum;
        if( index == arr.length ){
            return 0;
        }
        sum = arr[index] + sumOfElements(arr, index + 1);
        return sum;
    }
    public static void main(String[] args) {
        int []arr = { 3,4,5,8,2 };
        int sum = sumOfElements(arr, 0 );
        System.out.println("The sum of all elements are: "+sum);
    }
}
