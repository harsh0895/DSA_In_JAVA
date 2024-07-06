package Arrays;

//23. Prefix Sum:-

public class ar_23 {
    static void print_array( int []arr ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] prefix_sum( int []arr ){
        int n = arr.length;

        // method 1:- with creating a new array!

//        int ans[] = new int[n];
//        ans[0] = arr[0];
//        for( int i=1; i<arr.length; i++ ){
//            ans[i] = ans[i-1] + arr[i];
//        }

        //method 2:- without creating a new array!
        
        for( int i=1; i<arr.length; i++ ){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 2,1,3,4,5 };
        System.out.println("Original array is: ");
        print_array(arr);

        int ans[] = prefix_sum(arr);
        System.out.println("array after calculating prefix sum: ");
        print_array(ans);

    }
}
