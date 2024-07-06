package Binary_Search.Interview_Questions;

// 2. Write a program to find minimum element in Rotated sorted Array ?

public class iq_2 {
    // best approach
    static int min( int []arr, int start, int end){
        while( start < end){
            int mid = start + ( end-start )/2;
            if( arr[mid] > arr[end] ){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return arr[end];
    }
    static int findMinimum( int []arr, int start, int end ){
        int n = arr.length;
        if( n==1 ) return arr[0];
        // for not rotated array
        if( arr[start] < arr[end] ){
            return arr[start];
        }
        // for rotated array
        while( start <= end){
            int mid = start + (end - start)/2;
            if( arr[mid] > arr[mid+1] ){
                return arr[mid+1];
            }
            if( arr[mid] < arr[mid-1] ){
                return arr[mid];
            }
            if( arr[start] < arr[mid]){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = { 4,5,6,1,2,3 };
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int min = findMinimum(arr, start, end);
        System.out.println(min);
        int ans = min(arr, start, end);
        System.out.println(ans);
    }
}
