package Binary_Search;

// 6. Write a program to find the peak element in a mountain sorted array .

public class BS_6 {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,1 }; // peak element is 4!
        int start = 0;
        int end = arr.length-1;
        while ( start<=end ){
            int mid = start + (end-start)/2;
            if( arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1] ){
                System.out.println("Your peak element is: "+arr[mid]);
                break;
            }
            else if( arr[mid]<arr[mid+1] ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
    }
}
