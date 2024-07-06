package Arrays;

//25. Write a program to calculate the suffix sum of given array elements ?

public class ar_25 {
    static void print_array( int []arr ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] suffix_sum( int arr[] ){
        int n = arr.length;

        for( int i=n-2; i>=0; i-- ){
            arr[i] = arr[i+1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr = { 5,4,3,2,1 };
        System.out.println("Original array is: ");
        print_array(arr);

        int suffix[] = suffix_sum(arr);
        System.out.println("After calculating the suffix sum of the array an array is: ");
        print_array(suffix);

    }
}
