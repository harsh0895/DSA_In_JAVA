package Arrays;

// 13. Find the second largest and smallest element in the given array ?

public class ar_13 {
    static void find_secondMax( int []arr ){
        int max = Integer.MIN_VALUE;
        for( int i=0; i<arr.length; i++ ){
            if( arr[i]>max ){
                max = arr[i];
            }
        }
        System.out.println("Second Maximum value is: "+max);
    }

    static void find_secondMin( int arr[] ){
        int min = Integer.MAX_VALUE;
        for(  int i=0; i<arr.length; i++ ){
            if( arr[i]<min ){
                min = arr[i];
            }
        }
        System.out.println("Second Minimum value is: "+min);
    }
    public static void main(String[] args) {
        int arr[] = { 9,8,9,6,9,5,8 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for( int i=0; i<arr.length; i++ ){
            if( arr[i]>max ){
                max = arr[i];
            }
            if( arr[i]<min ){
                min = arr[i];
            }
        }
        System.out.println("Minimum value is: "+min);
        System.out.println("Maximum value is: "+max);

        // for second max value:-
//        for( int i=0; i<arr.length; i++ ){
//            if( arr[i]==max ){
//                arr[i] = -1;
//            }
//        }
//        find_secondMax(arr);

        // for second min value:-
        for( int i=0; i<arr.length; i++ ){
            if( arr[i]==min ){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        find_secondMin(arr);
    }
}
