package Array_2D;

// 5:- Write a program to print row index with maximum sum ?

public class RA_5 {
    public static void main(String[] args) {
        int sum = Integer.MIN_VALUE;
        int index = -1;
        int [][]arr = { {1,2,3}, {4,5,6}, {7,8,9} };
        for( int i=0; i< arr.length; i++ ){
            int total = 0;
            for( int j=0; j<arr[i].length; j++ ){
                total = total + arr[i][j];
                if( sum<total ){
                    sum = total;
                    index = i;
                }
            }
        }
        System.out.println("Maximum sum is "+sum+" of row index is "+index);
    }
}
