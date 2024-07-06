package Arrays;

// print all pairs:-

public class ar_29 {
    public static void main(String[] args) {
        int []arr = { 10, 20, 30};
        for( int i=0; i<arr.length; i++ ){
            for( int j=0; j<arr.length; j++ ){
                System.out.println(arr[i]+" "+arr[j]);
            }
            System.out.println();
        }
    }
}
