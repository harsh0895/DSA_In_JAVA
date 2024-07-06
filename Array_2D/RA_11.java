package Array_2D;

// 11. Write a program to rotate matrix to 90 degree clock wise as well as anti clock wise ?

public class RA_11 {
    static void print_2D_array( int [][]arr ){
        for( int i=0; i< arr.length; i++ ){
            for( int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
//    With creating a new array:-
    static void Rotation(int [][]arr, int row, int col ){
        int ans[][] = new int[row][col];
        for( int i=0; i<row; i++ ){
            for( int j=0; j<col; j++ ){
                ans[j][row-1-i] = arr[i][j]; // 3-1-0=2
            }
        }
        System.out.println("after rotation the matrix is: ");
        print_2D_array(ans);
    }

    //    Without creating a new array:-
    // 1- first will transpose of each then will reverse each row of matrix:-
    static void rotationWo( int [][]arr, int row, int col ){
        // Transpose:-
        for( int i=0; i<row-1; i++ ){
            for( int j=i+1; j<col; j++ ){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Reverse each row:-
        for( int i=0; i<arr.length; i++ ){
            int start = 0;
            int end = arr[i].length-1;
            while( start<end ){
                int temp = arr[i][start]; // 00
                arr[i][start] = arr[i][end]; //00=02
                arr[i][end] = temp; //02=00
                start++;
                end--;
            }
        }
        System.out.println("After rotation 90 degree in place clock wise: ");
        print_2D_array(arr);
    }

    static void Anti_clock( int [][]arr, int row, int col ){
        // Transpose:-
        for( int i=0; i<row-1; i++ ){
            for( int j=i+1; j<col; j++ ){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Reverse each column:-
        for( int i=0; i<arr.length; i++ ){
            int start = 0;
            int end = arr[i].length-1;
            while( start<end ){
                int temp = arr[start][i]; // 00
                arr[start][i] = arr[end][i]; //00=20
                arr[end][i] = temp; //20=00
                start++;
                end--;
            }
        }
        System.out.println("After rotation 90 degree in place Anti clock wise: ");
        print_2D_array(arr);
    }
    public static void main(String[] args) {
        int [][]arr = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                                };
        int row = 3, col = 3;
        System.out.println("Before Rotation Matrix is: ");
        print_2D_array(arr);
//        Rotation(arr, row, col);
//        rotationWo(arr, row, col);
        Anti_clock(arr, row, col);

    }
}
