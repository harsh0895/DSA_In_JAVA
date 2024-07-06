package Sorting_Algo;

public class Bubble_Sort {
    static void print_array( int []arr ){
        for( int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // increasing order:-
    static void bubble_sort( int []arr ){
        int n = arr.length;
        for( int i=0; i<n-1; i++){
            boolean swap = false;
            for( int j=0; j<n-i-1; j++){
                if( arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if( swap == false ){ // no swaps happened than we will return from the loop
                break;
            }
        }
        System.out.println("Array after sorting in increasing order: ");
        print_array(arr);
    }

    // decreasing order:-
    static void decreasing_order( int []arr ){
        int n = arr.length;
        for( int i=0; i<n-1; i++){
            boolean swap = false;
            for( int j=0; j<n-i-1; j++){
                if( arr[j] < arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if( swap == false ){ // no swaps happened than we will return from the loop
                break;
            }
        }
        System.out.println("Array after sorting in decreasing order: ");
        print_array(arr);
    }
    public static void main(String[] args) {
        int []arr = { 5,7,4,3,1 }; // 1 3 4 5 7
        System.out.println("Original array is: ");
        print_array(arr);
        bubble_sort(arr);
       decreasing_order(arr);
    }
}
