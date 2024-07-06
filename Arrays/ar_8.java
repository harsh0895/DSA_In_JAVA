package Arrays;

//8. Check if the given array is sorted or not ?

public class ar_8 {
    static boolean is_sorted( int []arr ){
        boolean check = true;
        for( int i=1; i<arr.length; i++ ){
            if( arr[i] < arr[i-1] ){
                // not sorted;
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        System.out.println("Is sorted: "+is_sorted(arr));
    }
}
