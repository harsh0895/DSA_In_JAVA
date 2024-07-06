package Binary_Search.Interview_Questions;

// 3. Write a program to find single element in Sorted array ?

public class iq_3 {
    public static void main(String[] args) {
        int []nums = {1,1,2,3,3,4,4,8,8};
        int xor_Value = 0;

        for(int num : nums) {
            xor_Value ^= num;
        }
        System.out.println(xor_Value);
    }
}
