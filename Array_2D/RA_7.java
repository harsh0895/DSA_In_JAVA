package Array_2D;

// 7:- Write a program to reverse each row elements of the given matrix ?

public class RA_7 {
    static void print_2D_array( int [][]arr ){
        for( int i=0; i< arr.length; i++ ){
            for( int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]arr = { {2,3,4,5},{1,2,6,8},{4,9,3,2} };

        System.out.println("Before reversing the elements of rows: ");
        print_2D_array(arr);

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

        System.out.println("after reversing the elements of rows: ");
        print_2D_array(arr);

    }
}
