package ArrayList;

// 1. Write a program to reverse the given arraylist.

import java.util.ArrayList;
import java.util.Collections;

public class al_2 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(5);
        li.add(6);
        System.out.println("Original list is: "+li);

//        Collections.reverse(li); // you can reverse with the help of collection utility classes!
//        Collections.sort(li); // it will sort in ascending order

        int i = 0;
        int j = li.size()-1;
        while( i < j ){
            Integer temp = Integer.valueOf(li.get(i));
            li.set(i, li.get(j));
            li.set(j, temp);
            i++;
            j--;
        }
        System.out.println("After reversing the list is: "+li);
    }
}
