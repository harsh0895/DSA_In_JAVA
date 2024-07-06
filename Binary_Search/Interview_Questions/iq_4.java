package Binary_Search.Interview_Questions;

public class iq_4 {
    static int search( int []arr, int target ){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if( arr[mid] == target){
                return mid;
            }
            if( arr[mid] < target && arr[mid] < arr[end]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 10,11,1,2, 3,4, 5, 6, 9 };
        int target = 9;
        int ans = search(arr, target);
        System.out.println(ans);
    }
}
