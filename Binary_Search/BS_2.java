package Binary_Search;

// 2. write a program to find the square root of x .

import java.util.Scanner;

public class BS_2 {
    static int SQRT( int x ){
        int ans = -1;
        int start = 1;
        int end  = x;
        int mid;
        while ( start<=end ){
            mid = start + (end-start)/2;
            if( mid*mid <= x ){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // x = 40 return 6 because largest upto 40 is 6!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you x element: ");
        int x = sc.nextInt();
        System.out.println("The largest `square root of x is: "+SQRT(x));

    }
}
