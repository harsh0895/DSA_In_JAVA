package Arrays;

//3. Write a program to print all even numbers in the given array ?

public class ar_3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};

        for( int i=0; i<arr.length; i++ ){
            if( arr[i]%2==0 ){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
