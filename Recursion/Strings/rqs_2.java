package Recursion.Strings;

import java.util.Scanner;

// 2. Write a program to count vowels in the given string which is present in the lowercase ?

public class rqs_2 {
    static int countVowels( String str, int index ){
        if( index == str.length() ) return 0;
        if( str.charAt(index)=='a' || str.charAt(index)=='e' || str.charAt(index)=='i' || str.charAt(index)=='o' || str.charAt(index)=='u'){
            return 1 + countVowels(str, index+1);
        }else{
            return countVowels(str, index+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.next();
        int ans = countVowels(str, 0);
        System.out.println("Total number of vowels is: "+ans);
    }
}
