package Strings;

public class str_10 {
    public static void main(String[] args) {

        int []nums = {2,5,1,3,4,7};
        int n = 3;
        int l = nums.length;
        int []ans = new int[l];
        int start = 0;
        int end = n;
        int point = 0;
        while( start<n && end<l ){
           ans[point++] = nums[start];
           ans[point++] = nums[end];
           start++;
           end++;
        }

        for (int e: ans){
            System.out.print(e+" ");
        }
    }
}
