package Strings;

// String Methods:-

public class str_2 {
    public static void main(String[] args) {
        String str = "Harsh Aman";
        System.out.println(str);

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.charAt(3)); // s
        System.out.println(str.indexOf('h')); // 4

        String st = "bbc";
        String gt = "abc";
        System.out.println(st.compareTo(gt));
        System.out.println(st.concat(gt)); // bbcabc

        System.out.println(str.contains("ama")); // false
        System.out.println(str.contains("Aman")); // true
        System.out.println(str.endsWith("an")); // true

        String s = "abcde";
        System.out.println(s.substring(1));
        System.out.println(s.substring(0,2)); // ab 2 is excluded!

    }
}
