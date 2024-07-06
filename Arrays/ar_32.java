package Arrays;

public class ar_32 {
    public static void main(String[] args) {
        int arr[] = { 2,3,5,7 };
        int ans;
        int mul = 1;
        for( int i=0; i< arr.length; i++ ) {
            mul = mul * arr[i];
        }
        // 210
        for( int j=0; j<arr.length; j++ ) {
            if( j == arr.length-1 ) {
                System.out.println(mul / arr[0]);
            }else {
                System.out.println(mul / arr[j+1]);
            }
        }
    }
}
