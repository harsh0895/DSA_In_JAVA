package Arrays;

// 31. Write a program to remove duplicates from the sorted array.

public class ar_31 {
    static int remove(int []arr ){
        int n = arr.length;
        int i = 0;
        for( int j=1; j < n; j++ ){
            if( arr[i] != arr[j] ){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int []arr = { 1,2,2,2,3,4 };
        int k = remove(arr); // new array length;
        for( int i=0; i < k; i++){
            System.out.println(arr[i]);
        }
    }
}
