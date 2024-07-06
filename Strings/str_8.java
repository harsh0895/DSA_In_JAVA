package Strings;

// 4. Write a program to reverse each word in a string ?

public class str_8 {
    public static void main(String[] args) {
        String str = "I a an online educator";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for( int i=0; i<str.length(); i++ ){
            char ch = str.charAt(i);
            if( ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
