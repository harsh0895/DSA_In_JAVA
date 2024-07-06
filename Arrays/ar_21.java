package Arrays;

//21. Write a program to arranging an elements of the given array in the order of even and odd numbers ?

public class ar_21 {
    static void print_array( int arr[] ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sort_even_odd( int []arr ){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while ( i<j ){
            if( arr[i]%2!=0 && arr[j]%2==0 ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if( arr[i]%2==0 ){
                i++;
            }
            if( arr[j]%2!=0 ){
                j--;
            }
        }
        print_array(arr);
    }
    public static void main(String[] args) {
        int []arr = { 0,1,2 };
        System.out.println("Original array is: ");
        print_array(arr);

        System.out.println("After arranging the elements are: ");
        sort_even_odd(arr);

    }
}
