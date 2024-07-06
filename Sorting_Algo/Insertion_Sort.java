package Sorting_Algo;

public class Insertion_Sort {
    static void print_array( int []arr ){
        for( int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void Insertion_sortInc( int []arr){
        int n = arr.length;
        for( int i=1; i<n; i++){
            for( int j=i; j>0; j--){
                if( arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        print_array(arr);
    }
    static void Insertion_sortDec( int []arr){
        int n = arr.length;
        for( int i=1; i<n; i++){
            for( int j=i; j>0; j--){
                if( arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        print_array(arr);
    }
    public static void main(String[] args) {
        int arr[] = { 2,3,4,5,1 };
        System.out.println("Array sort in Increasing order: ");
        Insertion_sortInc(arr);
        System.out.println("Array sort in Decreasing order: ");
        Insertion_sortDec(arr);
    }
}
