package Strings;

// 3. Write a program to print number of palindromic string of substring in it ?

public class str_7 {
    static boolean isPalindrome( String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abcd";
        int count = 0;
        for( int i=0; i<str.length(); i++ ){
            for( int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j)+" ");
                if( isPalindrome(str.substring(i,j))==true ){
                    count++;
                }
            }
        }
        System.out.println("The number of palindromic substrings are: "+count);
    }
}
