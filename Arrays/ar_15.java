package Arrays;

// 15. Reverse an array consisting of integer values ?

public class ar_15 {
    static void print_array( int arr[] ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reverse_array( int arr[] ){
        int n = arr.length;
        int ans[] = new int[n];
        int j=0;
        for( int i=arr.length-1; i>=0; i--){
            ans[j++] = arr[i];
        }
        System.out.println("Array after reversing is: ");
        print_array(ans);
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };

        System.out.println("Original array is: ");
        print_array(arr);

        reverse_array(arr);


    }
}
