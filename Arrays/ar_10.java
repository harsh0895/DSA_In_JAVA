package Arrays;

//10. Target sum :- Write a program to find the total number of pairs in tha array whose sum is equal to given target ?

public class ar_10 {
    public static void main(String[] args) {
        int []arr = { 4,6,3,5,8,2 };
        int target = 7;
        int ans = 0;
        for( int i=0; i<arr.length; i++){
            for( int j=i+1; j<arr.length; j++){
                if( arr[i] + arr[j] == target ){
                    System.out.println(arr[i]+" "+arr[j]);
                    ans++;
                }
            }
        }
        System.out.println("The total number of pairs is: "+ans);
    }
}
