package Arrays;

//11. Target sum :- Write a program to find the total number of triplets in tha array whose sum is equal to given target ?

public class ar_11 {
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,3};
        int target = 12;
        int count = 0;
        for( int i=0; i<arr.length; i++ ){
            for( int j=i+1; j<arr.length; j++ ){
                for( int k=j+1; k<arr.length; k++ ){
                    if( arr[i] + arr[j] + arr[k] == target ){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("The total number of triplets are: "+count);
    }
}
