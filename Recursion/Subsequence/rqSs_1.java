package Recursion.Subsequence;

// 1. Return all subsequences of the given string in an ArrayList.

import java.util.ArrayList;

public class rqSs_1 {

    //  in this method of subsequence it will take lot of space in memory an its not a best solution!
    static ArrayList<String> allSubsequence( String str ) {
        ArrayList<String> ans = new ArrayList<>();
        // base case
        if( str.length() == 0 ){
            ans.add("");
            return ans;
        }
        char ch = str.charAt(0); //a
        ArrayList<String> smallAns = allSubsequence(str.substring(1)); // ["bc", "b", "c", ""]
        // smallAns = ["bc", "b", "c", ""]
        // ans = ["bc", "abc", "b", "ab", "c", "ac", "", "a"]
        for(String ss: smallAns){
            ans.add(ss);
            ans.add(ch + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = allSubsequence("abc"); // abc ab ac a bc b c " "
        for( String ss: ans ){
            System.out.println(ss+" ");
        }
    }
}
