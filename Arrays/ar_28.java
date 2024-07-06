package Arrays;

public class ar_28 {
    static int SecondSmallest( int []arr ){
        int n = arr.length;
        int small = Integer.MAX_VALUE;
        int SS = Integer.MAX_VALUE;
        for( int i=0; i < n; i++ ){
            if( small > arr[i]){
                SS = small;
                small = arr[i];
            }
            else if ( SS > arr[i]){
                SS = arr[i];
            }
        }
        return SS;
    }
    public static void main(String[] args) {
        int []arr = { 2,1,3,4,5 };
        int ans  = SecondSmallest(arr);
        System.out.println(ans);
    }
}
