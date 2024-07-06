// Write a program to calculate the largest sum of subArray in the given array:-

package Arrays;

public class Kadane_Algorithm {
    public static void main(String[] args) {
        int []arr = { 4,-6,2,8,2 };
        int n = arr.length;
        int prefixSum = 0;
        int maxi = Integer.MIN_VALUE;
        for( int i=0; i<n; i++ ){
            prefixSum = prefixSum + arr[i];
            maxi = Integer.max( maxi, prefixSum );
            if( prefixSum<0 ){
                prefixSum = 0;
            }
        }
        System.out.println("Largest sub array sum is: "+maxi);
    }
}
