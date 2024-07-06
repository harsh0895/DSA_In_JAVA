package Recursion.Subsequence;

// 3. Write a program to print all subsequence of the given array by using recursion.

import java.util.ArrayList;

public class rqSs_3 {
    static void subSeq( int []arr, int index, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp ) {
        // base case
        if( index == arr.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        // if you don't take element
        subSeq(arr, index + 1, ans, temp);
        // if you take
        temp.add(arr[index]); // adding element in temp array
        subSeq(arr, index + 1, ans, new ArrayList<>(temp));
        temp.remove(temp.size() - 1); // backtrack, removing the last added element
    }
    public static void main(String[] args) {
        int []arr = { 1,2,3 };
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        subSeq( arr, 0, ans, temp);
        // after finding all the subset of given array then print 2-d arrayList:-
        for( int i=0; i<ans.size(); i++ ){
            for( int j=0; j<ans.get(i).size(); j++ ){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }

        // USING FOR-EACH LOOP:-
        // printing 2D array
//        for (ArrayList<Integer> subList : ans) {
//            for (int num : subList) {
//                System.out.print("{" + num + "} ");
//            }
//            System.out.println();
//        }
    }
}
