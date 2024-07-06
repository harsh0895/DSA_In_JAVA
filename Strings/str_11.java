package Strings;

// 11. Write a program to find first unique character in the given string and return its index, if not exists return -1.

public class str_11 {
    static int firstUniqChar(String s) {
        int n = s.length();
        for(int i=0; i < n; i++){
            char currentChar = s.charAt(i);
            boolean isUnique = true;
            for( int j = 0; j < n; j++){
                if( i != j && currentChar == s.charAt(j) ) {
                    isUnique = false;
                    break;
                }
            }
            if( isUnique ){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "loveleetcode";
        int ans = firstUniqChar(str);
        System.out.println(ans);
    }
}
