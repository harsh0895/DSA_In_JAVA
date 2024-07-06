package Recursion.Subsequence;

// 2. Print all subsequences of the given string.

public class rqSs_2 {

    // it is best solution for finding the all subsequences of the given string!
    static void printAllSs( String str, String currAns ){
        // base case
        if( str.length()==0 ){
            System.out.println(currAns);
            return;
        }
        char curr = str.charAt(0);
        String remainingString = str.substring(1);
        printAllSs(remainingString, currAns + curr); // add curr char
        printAllSs(remainingString, currAns); // do not add curr char
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Original String is: "+str);
        System.out.println("All subsequences are: ");
        printAllSs(str, "");
    }
}
