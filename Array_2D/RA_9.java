package Array_2D;

// 9:- Write a program to print spiral matrix of 2D array ?

public class RA_9 {
    public static void main(String[] args) {
        int arr[][] = { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
        int row = 4, col = 4;
        int top = 0; // for row
        int bottom = row-1; // for row
        int left = 0; // for column
        int right = col-1; // for column

        while( top<=bottom && left<=right ){

            // print top side:-
            for( int i=left; i<=right; i++ ){
                System.out.print(arr[top][i]+" ");
            }
            top++;
//            System.out.println();

            // print right side:-
            for( int j=top; j<=bottom; j++ ){
                System.out.print(arr[j][right]+" ");
            }
            right--;
//            System.out.println();

            // print bottom side:-
            if( top<=bottom ){
                for( int k=right; k>=left; k-- ){
                    System.out.print(arr[bottom][k]+" ");
                }
                bottom--;
//                System.out.println();
            }

            // print left side:-
            if( left<=right ){
                for( int l=bottom; l>=top; l-- ){
                    System.out.print(arr[l][left]+" ");
                }
                left++;
//                System.out.println();
            }
        }
    }
}
