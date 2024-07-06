package Recursion.Strings;

// 5. Reverse a string using recursion.

import java.util.Scanner;

public class rqs_5 {
    static String reverse(String str, int index){
        if( index==str.length() ) return "";

        return reverse(str, index+1) + str.charAt(index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        System.out.println("Before reversing: "+str);
        String ans = reverse(str, 0);
        System.out.println("After reversing: "+ans);

    }
}
