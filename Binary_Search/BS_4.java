package Binary_Search;

// 4. A rotated sorted array is a sorted array on which a rotation operation has been performed some number of times, then find the minimum
// element index number is, else return -1 .
public class BS_4 {
    /*
        TC = O(log n)
        SC = O(1)
     */
    static int findMinimum_rotatedSorted( int []arr ){
        int start = 0;
        int end = arr.length-1;
        if( arr.length==1 ){
            return arr[0];
        }
        // if array is only sorted:-
        if( arr[start] < arr[end ]) return start; // for sorted array.

        // for rotated sorted array:-
        while( start<=end ){
            int mid = start + (end-start)/2;
            if( arr[mid]>arr[mid+1] ){ // if next element minimum from the mid.
                return mid+1;
            }
            if( arr[mid]<arr[mid-1] ){
                return mid; // if mid element is minimum from the mid-1.
            }
            if( arr[mid]>arr[start] ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    // method 2:-
    static int minimum( int []arr ){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while( start<=end ){
            int mid = start + (end-start)/2;
            if( arr[mid]<=arr[end] ){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr = { 5,1,2,3,4 };
        int min = findMinimum_rotatedSorted(arr);
        System.out.println("Minimum element index is: "+min);
        System.out.println(minimum(arr));
    }
}
