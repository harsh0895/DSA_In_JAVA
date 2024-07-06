package Arrays;

// 16. Two Pointer Approach:- Reverse an array without creating a new array ?

public class ar_16 {
    static void print_array( int arr[] ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reverseArray( int arr[] ){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while( start<=end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Array after reversing: ");
        print_array(arr);
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8 };

        System.out.println("Original array is: ");
        print_array(arr);

        reverseArray(arr);

    }
}
