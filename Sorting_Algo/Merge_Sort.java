package Sorting_Algo;

// it is a divide and conquer approach:-

public class Merge_Sort {
    static void printArray(int []arr ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // merge two sorted array
    static void mergeTwoSortedArray( int []arr, int start, int mid, int end ) {
        int newArraySize = end - start + 1; // start = 0 end = 9 = (9-0+1 = 10)
        int []temp = new int[newArraySize];
        int left = start;
        int right = mid + 1;
        int index = 0; // temp[index] for filling array

        // sort two array
        while( left <= mid && right <= end ){
            // if left element is smaller temp[0] = arr[left]
            if( arr[left] <= arr[right] ){
                temp[index] = arr[left];
                index++; left++;
            }
            // if right element is smaller temp[index] = arr[right]
            else{
                temp[index] = arr[right];
                index++; right++;
            }
        }

        // if left array elements are left so copy in temp array
        while( left<=mid ){
            temp[index] = arr[left];
            index++; left++;
        }

        // if right array elements are left so copy in temp array
        while( right<=end ){
            temp[index] = arr[right];
            index++; right++;
        }
        // temp[]
        // after sorted two array then will copy temp sorted array into original array arr[]
        index = 0;
        while( start<=end ){
            arr[start] = temp[index];
            start++; index++;
        }
        // after this original array has sorted!
    }
    static void mergeSort( int []arr, int start, int end ) {
        // base case
        if( start == end ) return;
        int mid = start + (end - start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        // after sorting left or right array then will merge
        mergeTwoSortedArray(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int []arr = { 6,4,3,5,7,8,1,2 };
        System.out.println("Original Array is: ");
        printArray(arr);
        mergeSort(arr, 0, arr.length-1);
        System.out.println("After sorting the array is: ");
        printArray(arr);

    }
}
