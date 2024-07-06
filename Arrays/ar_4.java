package Arrays;

//4. Write a program to find minimum value in the given array ?

public class ar_4 {
    public static void main(String[] args) {
        int arr[] = {2, -3, 5, 8, 1, 0, -4};

        int min = 0;
        for( int i=0; i<arr.length; i++ ){
            if( arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The minimum value is in the array: "+min);
    }
}
