package Array_2D;

// 12:- Write a program to Rotate Matrix 180 degree ?

public class RA_12 {
    static void print_2D_array( int [][]arr ){
        for( int i=0; i< arr.length; i++ ){
            for( int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void Rotation180( int [][]arr, int row, int col ){
        // swap column wise:-
        for( int i=0; i<row; i++ ){
            int start=0;
            int end = col-1;
            while( start<end ){
                int temp = arr[start][i];
                arr[start][i] = arr[end][i];
                arr[end][i] = temp;
                start++;
                end--;
            }
        }
        // swap row wise:-
        for( int i=0; i<row; i++ ){
            int start = 0;
            int end = col-1;
            while( start<end ){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        System.out.println("After Rotation matrix is: ");
        print_2D_array(arr);
    }
    public static void main(String[] args) {
        int [][]arr = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                                };
        int row = 3, col = 3;
        System.out.println("Original Matrix is: ");
        print_2D_array(arr);
        Rotation180(arr, row, col);

    }
}
