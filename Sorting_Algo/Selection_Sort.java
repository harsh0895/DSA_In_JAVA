package Sorting_Algo;

public class Selection_Sort {
    static void print_array( int []arr ){
        for( int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void Selection_sortInc( int []arr ){

        for( int i=0; i<arr.length-1; i++ ){
            int index = i;
            for( int j=i+1; j<arr.length; j++ ){
                if( arr[j]<arr[index] ){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    static void decreasing_order( int []arr){

        for( int i=0; i<arr.length-1; i++){
            int index = i;
            for( int j=i+1; j<arr.length; j++ ){
                if( arr[j]>arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void main(String[] args) {
        int []arr = { 5,4,1,2,3 };
        System.out.println("Original array is: ");
        print_array(arr);

        System.out.println("Array after sorting in increasing order: ");
        Selection_sortInc(arr);
        print_array(arr);

        System.out.println("Array after sorting in decreasing order: ");
        decreasing_order(arr);
        print_array(arr);

    }
}
