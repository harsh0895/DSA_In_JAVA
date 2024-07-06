package Recursion.Strings;

// 3. Write a program to reverse a given string ?

import java.util.Scanner;

public class rqs_3 {
    static void reverseString( String []str, int start, int end ){
        if( start >= end ) {
            String ch = str[start];
            str[start] = str[end];
            str[end] = ch;
            reverseString(str, start + 1, end - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.next();
        String arr[] = str.split("");
        System.out.println("Split in array:");
        for (String st : arr) {
            System.out.print(st+ " ");
        }
        System.out.println();
        System.out.println("Before reversing: "+str);
        reverseString(arr, 0, arr.length-1);
        System.out.println("after reversing the string: ");

    }
}
