package Strings;

public class str_9 {
    public static void main(String[] args) {
        String str = "the sky is blue";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String ans = "";
        StringBuilder an = new StringBuilder("");
        int j=0;
        for( int i=0; i<str.length(); i++ ){
            char ch = sb.charAt(i);
            if( ch!=' '){
                an.append(ch);
            }
            else{
                an.reverse();
                ans += an;
                ans+= " ";
                an = new StringBuilder("");
            }
        }
        an.reverse();
        ans += an;
        System.out.println(ans);
    }
}
