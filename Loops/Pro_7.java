package Loops;

//7. Swap two values a and b ?

public class Pro_7 {
    static void swap( int a, int b ){
        System.out.println("Before swapping the value");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        // first method :-

//        int temp;
//        temp = a;
//        a = b;
//        b = temp;

        // second method :-
        a = a+b; // 15
        b = a-b; // 10
        a = a-b; // 5

        System.out.println("After swapping the value");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}
