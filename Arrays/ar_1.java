package Arrays;

//1. Write a program to print all positive numbers in the given array ?

public class ar_1 {
    public static void main(String[] args) {
        int arr[] = {2, 6, -5, -1, 0, 4, -9};

        int ans = -1;

        System.out.println("All positive elements are in the array: ");
        for( int i=0; i<arr.length; i++ ){
            if( arr[i]>=0){
                ans = arr[i];
                System.out.println(ans+" ");
            }
        }
    }
}
