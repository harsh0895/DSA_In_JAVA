package Array_2D;

// 10:- Write a program to print transpose of a matrix ?

public class RA_10 {
    static void print_2D_array( int [][]arr ){
        for( int i=0; i< arr.length; i++ ){
            for( int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    // With creating a new array:-
    static void TransposeM(int [][]arr, int row, int col ){
        int [][]transpose = new int[row][col];
        for( int i=0; i<row; i++ ){
            for( int j=0; j<col; j++ ){
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println("After the transpose of a matrix is: ");
        print_2D_array(transpose);
    }

    // Without creating a new array:- only for square matrix:-

    static void transpose_Inplace( int [][]arr, int row, int col ){
        for( int i=0; i<row-1; i++ ){
            for( int j=i+1; j<col; j++ ){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("After the in place transpose of a matrix is: ");
        print_2D_array(arr);
    }
    public static void main(String[] args) {
        int [][]arr = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                                };
        int row = 3;
        int col = 3;
        System.out.println("Original array is: ");
        print_2D_array(arr);
//        TransposeM(arr, row, col);
        transpose_Inplace(arr, row, col);

    }
}
