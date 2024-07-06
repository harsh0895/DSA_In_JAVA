package ArrayList;

import java.util.ArrayList;

// Advantages of Arraylist or limitation of array:-
/*
1. you can add any type of data in arraylist but in the case of array you can not.
2. you don't have to specify the size of arraylist during the making of arraylist but in the case of array you have to specify.
3.
 */

public class al_1 {
    public static void main(String[] args) {
        // wrapper classes
//        Integer li = Integer.valueOf(2);
//        System.out.println(li);
//        Float fi = Float.valueOf(3.5f);
//        System.out.println(fi);

        // Creating arrayList:-
        ArrayList<Integer> li = new ArrayList<>(); // in this case of arraylist you can add only Integer type of data.
        ArrayList l2 = new ArrayList(); // but in this case you can add any type of data in list

        // add new element
        li.add(2); // 2
        li.add(3); // 2 3
        li.add(4); // 2 3 4
        li.add(5); // 2 3 4 5

        // get an element using index
        System.out.println(li.get(0)); // 2
        System.out.println(li.get(1)); // 3

        // get all elements by using loop
        for( int i=0; i<li.size(); i++ ){
            System.out.println(li.get(i)+" "); // 2,3,4,5
        }

        // printing the arraylist directly
        System.out.println(li); // [2,3,4,5]

        // adding new element at some index
        li.add(0, 1);
        System.out.println(li); // [1,2,3,4,5]

        // set element at some index
        li.set(4,6); // [1,2,3,4,6]
        System.out.println(li);

        // removing an element at some index
        li.remove(1);
        System.out.println(li); // [1, 3, 4, 6]

        // remove an element by using value
        li.remove(Integer.valueOf(6));
        System.out.println(li); // [1,3,4]

        // checking element index
        System.out.println(li.indexOf(4)); // 2
        li.add(4);
        li.add(3);
        System.out.println(li); // [1, 3, 4, 4, 3]
        // checking last index of given element
        System.out.println(li.lastIndexOf(3)); // 4

        // checking oue list is empty of not
        boolean check = li.isEmpty();
        System.out.println(check); // false

        // checking if an element exists
        boolean ans = li.contains(Integer.valueOf(1));
        System.out.println(ans); // if yes return true else false

        // if you don't specify class, you can put anything inside i
        l2.add(2);
        l2.add("harsh");
        l2.add(true);
        System.out.println(l2); // [2, harsh, true]

    }
}
