package Array_2D;

// 8:- Write a program to print wave form of 2D array ?

public class RA_8 {
    static void print_2D_array( int [][]arr ){
        for( int i=0; i< arr.length; i++ ){
            for( int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]arr = { {3,6,4,2}, {7,8,11,5}, {9,3,2,1}, {17,8,5,9} };
        System.out.println("Original array is: ");
        print_2D_array(arr);
        int row = 4;
        int col = 4;
//        int n = arr.length * 4; //row*col
//        int []wave = new int[n];
        for( int j=0; j<col; j++ ){
            // col=even(print-> up-down)
            if( j%2==0){
                for( int i=0; i<arr.length; i++ ){
                    System.out.print(arr[i][j]+" ");
                }
            }
            // col=odd(print-> down-up)
            else{
                for( int i=row-1; i>=0; i-- ){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
}
