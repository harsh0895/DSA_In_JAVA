package Arrays;

//12. Find unique element in the array ?

public class ar_12 {
    static int find_unique( int []arr ){
        for( int i=0; i<arr.length; i++ ){
            for( int j=i+1; j<arr.length; j++ ){
                if( arr[i] == arr[j] ){
                    arr[i] = arr[j] = -1;
                }
            }
        }
        int unique = -1;
        for( int i=0; i<arr.length; i++ ){
            if( arr[i] > 0 ){
                unique = arr[i];
            }
        }
        return unique;
    }
    public static void main(String[] args) {
       int arr[] = { 1,2,3,2,1 };
        System.out.println("Unique element is: "+find_unique(arr));
        
    }
}
