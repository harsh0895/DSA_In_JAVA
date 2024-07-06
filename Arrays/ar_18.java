package Arrays;

//18. Write a program to calculate the sum of an array element ?

public class ar_18 {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for( int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of an array element is: "+sum);
    }
}
