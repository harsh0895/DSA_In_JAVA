package Recursion.Strings;

// 4. Write a program to Remove all character occurrences in the given string.

import java.util.Scanner;

public class rqs_4 {
    static String removeAllOcc( String str, int index, char ch ){
        if( index==str.length() ){
            return "";
        }
        if( str.charAt(index) != ch ){
            return str.charAt(index) + removeAllOcc(str, index+1, ch);
        }else{
            return removeAllOcc(str, index+1, ch);
        }
    }

    // method 2:- Without passing index:-
    static String remove2( String str ){
        if( str.length()==0 ) return "";

        String small = remove2(str.substring(1));
        char currentChar = str.charAt(0);
        if( currentChar != 'a') {
            return currentChar + small;
        }else{
            return small;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String str = sc.next();
//        System.out.println("Enter your character: ");
        char ch = 'a';
        System.out.println("Before removing the characters: "+str);
//        String ans = removeAllOcc(str, 0, ch);
        String ans2 = remove2(str);
        System.out.println("After removing the characters: "+ans2);
    }
}
