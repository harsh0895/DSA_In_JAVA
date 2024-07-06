package Arrays;

//22. For an array 'a' sorted in non-decreasing order, return an array of squares of each number sorted in non-decreasing order ?

public class ar_22 {
    static void print_array( int []arr ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reverse_array( int []arr ){
        int i=0;
        int j = arr.length-1;
        while (i<=j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static int[] square_array( int []arr ){
        int n = arr.length;
        int square[] = new int[n];
        int k=0;
        int i=0;
        int j=n-1;

        while( i<=j ){
            if( Math.abs(arr[i]) > Math.abs(arr[j]) ){
                square[k++] = arr[i] * arr[i];
                i++;
            }else {
                square[k++] = arr[j] * arr[j];
                j--;
            }
        }
        return square;
    }
    public static void main(String[] args) {
        int arr[] = { -10,-3,-2,1,4,5 };
        System.out.println("Original array is: ");
        print_array(arr);
        int ans[] = square_array(arr);
        System.out.println("Sorted array: ");
        reverse_array(ans);
        print_array(ans);
    }
}
