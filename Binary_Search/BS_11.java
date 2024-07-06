package Binary_Search;

// 11. Amazon Question:- Position of an Element in Infinite Sorted Array ?

public class BS_11 {
    static int binarySearch( int []arr, int key, int start, int end ){
        // we cannot take start or end index because we have infinite array!
        int mid;
        while( start<=end ){
            mid = start + (end - start)/2;
            if( arr[mid] == key ){
                return mid;
            }
            else if( arr[mid]<key ) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    static int ans(int []arr, int target ){
        int start = 0;
        int end = 1;

        // condition for the target element to lie in the range:-
        while( target>=arr[end] ){
            // this is my new start
            int newstart = end + 1;
            // double the size of the box
            // end = previous end + sizeofbox*2;
            end = end + (end-start + 1) * 2; // 1 + (1-0+1)*2 = 1+2*2 = 1+4=5
            start = newstart; // 2
        }
        return binarySearch(arr,target,start,end);
    }
    public static void main(String[] args) {
        int[] arr = { 2,3,4,5,6,7,8,11,13,15,18,20,21,22,25 };
        int target = 8 ;
        System.out.println("Target element index is: "+ans(arr, target));
    }
}
