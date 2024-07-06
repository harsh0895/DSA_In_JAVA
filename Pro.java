public class Pro {

    static int findSingleElement( int []arr ) {
        int result = 0;

        for (int num: arr) {
            result ^= num;
        }
        return result;
    }
    static int find_unique( int []arr ){
        for( int i=0; i<arr.length; i++ ){
            for( int j=i+1; j<arr.length; j++ ){
                if( arr[i] == arr[j] ){
                    arr[i] = arr[j] = -1;
                }
            }
        }
        int unique = -1;
        for( int i=0; i<arr.length; i++ ){
            if( arr[i] > 0 ){
                unique = arr[i];
            }
        }
        return unique;
    }

    public static void main(String[] args) {

        int []arr = {998760, 7, 7, 4, 4, 9, 9};
        int ans = findSingleElement(arr);
        System.out.println(ans);

    }
}
