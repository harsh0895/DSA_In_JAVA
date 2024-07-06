package Strings;

// Declaration of string:-

import java.util.Scanner;

public class str_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // char array:- method 1
        char []str = new char[10];

        // using string keyword:- method 2
        String name = "Harsh Bhola";
        System.out.println(name);

        // Take input from the user:-
        String s = sc.next(); // it will print only one word!
        String s2 = sc.nextLine(); // it will print complete paragraph!
        System.out.println(s);
        System.out.println(s2);

    }
}
