package Arrays;

// 26. write a program to find missing number in the given array ?

public class ar_26 {
    public static void main(String[] args) {
        int arr[] = {2,4,8,10,12,14};
        int n = arr.length;
        int total = 0;
        int last = arr[n-1];
        System.out.println(last);
        for( int i=0; i<last; i++){
            total = total + arr[i];
        }
        int sum = 0;
        for( int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        int missing =  total - sum;
        System.out.println("Missing number is: "+missing);
    }
}
