package Sorting_Algo;

public class Quick_Sort {
    static void printArray(int []arr ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int findPivotIndex( int []arr, int start, int end ){
        int position = start;
        for( int i=start; i<=end; i++ ){
            if( arr[i] <= arr[end] ){
                int temp = arr[position]; // temp = arr[0]
                arr[position] = arr[i];  // arr[0] = arr[1]
                arr[i] = temp; // arr[1] = arr[0]
                position++;
            }
        }
        return position-1;
    }

    static void implementQuickSort( int []arr, int start, int end ){
        if( start >= end ) return;
        int pivot = findPivotIndex(arr, start, end);

        implementQuickSort(arr, start, pivot-1 ); // sort left side of pivot index
        implementQuickSort(arr, pivot, end ); // sort right side of pivot index
    }
    public static void main(String[] args) {
        int []arr = { 6,2,5,1,4,2,3 };
        System.out.println("Before sorting an Array: ");
        printArray(arr);
        implementQuickSort(arr, 0, arr.length-1);
        System.out.println("After sorting an Array: ");
        printArray(arr);
    }
}
