package ArrayList;

public class al_3 {
    public static void main(String[] args) {
        int arr[] = { 1,2,2,4}; // {2,2}
        int n = arr.length;
        int ans[] = new int[2];
        int dup     = -1;
        int missing = -1;

        for(int i = 0; i<n; i++) {
            int num = Math.abs(arr[i]);

            if(arr[num-1] < 0)
                dup = num;
            else
                arr[num-1] *= (-1);
        }

        for(int i = 0; i<n; i++) {
            if(arr[i] > 0) {
                missing = i+1;
                break;
            }
        }
        ans[0] = dup;
        ans[1] = missing;
        for( int k=0; k<ans.length; k++){
            System.out.print(ans[k]+" ");
        }
    }
}
