package Recursion.Arrays;

// 6. Find the Number of even elements in a given array of size N.

public class rqa_6 {
    static int numberOfEvenElements( int []arr, int index, int []even ){
        // base case
        if( index < arr.length ){
            if( arr[index] % 2 == 0 ){
                even[0]++;
                numberOfEvenElements(arr, index + 1, even);
            }else{
                numberOfEvenElements(arr, index + 1, even);
            }
        }
        int total = even[0];
        return total;
    }

    static int countEvenElements(int[] arr, int n) {
        // Base case: if array size is 0, there are no even elements
        if (n == 0) {
            return 0;
        }

        // Recursive case: check if the last element is even
        int count = countEvenElements(arr, n - 1);
        if (arr[n - 1] % 2 == 0) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int []arr = { 1,2,3,4,5,6,7,8 };
        int []even = {0};
//        int evenElements = numberOfEvenElements(arr, 0, even);
//        System.out.println("The total even elements are: "+evenElements);

        System.out.println(countEvenElements(arr, arr.length));
    }
}
