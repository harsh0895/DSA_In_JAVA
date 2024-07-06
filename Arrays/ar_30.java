package Arrays;

// 30. Write a program to find sum of two arrays.
public class ar_30 {
    public static int findArraySum(int[] arr) {
        // Write your code here.
        int count = 0;
        for( int i=0; i<arr.length; i++ ){
            count = count * 10 + arr[i];
        }
        return count;
    }
    static int count(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
    static int reverse(int n){
        int rev = 0;
        while( n > 0){
            int rem = n % 10;
            n = n/10;
            rev = rev * 10 + rem;
        }
        return rev;
    }
    public static void main(String[] args) {
        int []arr1 = {4,5,1};
        int []arr2 = {3,4,5};
        int a = findArraySum(arr1);
        int b = findArraySum(arr2);
        int ans = a + b;
        int n = count(ans);
        int []arr = new int[n];
        int i=0;
        int rev = reverse(ans);
        while ( rev > 0){
            int rem = rev % 10;
            arr[i++] = rem;
            rev = rev / 10;
        }
        for( int e: arr){
            System.out.print(e+" ");
        }

    }
}
