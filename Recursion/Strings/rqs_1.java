package Recursion.Strings;

// 1. Write a program to check given string is palindrome or not ?

import java.util.Scanner;

public class rqs_1 {
    static int checkPalindrome( String str, int start, int end ){
        // base case
        if( start >= end ) return 1;
        if( str.charAt(start) != str.charAt(end) ) return 0;
        return checkPalindrome(str, start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.next();
        int ans = checkPalindrome(str, 0, str.length()-1);
        System.out.println(ans == 1 ? "Given string is palindrome!" : "Given string is not palindrome!");
    }
}
