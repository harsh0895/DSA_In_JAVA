package Arrays;

// 14. Find the first repeated value in the given array ?

public class ar_14 {
    public static void main(String[] args) {
        int arr[] = { 1,5,3,4,6,3,4 };

        for( int i=0; i<arr.length; i++ ){
            for( int j=i+1; j<arr.length; j++ ){
                if( arr[i] == arr[j] ){
                    System.out.println("First repeated value is: "+arr[i]);
                    return;
                }
            }
        }
    }
}
