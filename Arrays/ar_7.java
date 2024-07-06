package Arrays;

//7. Find the strictly greater and smallest elements in the array ?

import java.util.Scanner;

public class ar_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your element x: ");
        int X = sc.nextInt();
        int greater = 0;
        int small = 0;
        int arr[] = { 1,2,3,4,5,6,7,8};
        for( int i=0; i<arr.length; i++){
            if( arr[i]>X ){
                greater++;
            }
            if( arr[i]<X ){
                small++;
            }
        }
        System.out.println("The strictly greater elements in array from X: "+greater);
        System.out.println("The strictly smallest elements in array from X: "+small);

    }
}
