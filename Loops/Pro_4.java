package Loops;

//4. Find the sum of the following series 1-2+3-4+5.....

import java.util.Scanner;

public class Pro_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your series number: ");
        int n = sc.nextInt();
        int ans = 0;
        for( int i=1; i<=n; i++){
            if(i%2==0){
                ans = ans - i;
            }
            else{
                ans = ans + i;
            }
        }
        System.out.println("The ans is: "+ans);
    }
}
