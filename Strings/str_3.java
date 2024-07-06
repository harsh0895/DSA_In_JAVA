package Strings;

// 1. print all the substring of the given string!

public class str_3 {
    public static void main(String[] args) {
        String str = "abcd";
        for( int i=0; i<str.length(); i++ ){
            for( int j=i+1; j<=str.length(); j++ ){
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
