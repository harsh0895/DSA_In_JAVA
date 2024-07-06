package LinkedList;

public class LL_1 {

    public static void displayRec( Node head){
        if( head== null ) return;
        System.out.print(head.data+" ");
        displayRec(head.next);
    }

    public static void display(Node head ){
        int count=0;
        Node temp = head;
        while( temp!=null ){
            System.out.print(temp.data+" ");
            count++;
            temp = temp.next;
        }
        System.out.println("length of list is: "+count);
    }
    public static class Node{
        int data; // value
        Node next; // address of next node
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        System.out.println(a.data); // 1 Head node
//        System.out.println(a.next); // b ka address 1 -> 2  3  4
//        System.out.println(b.data); // 2
//        System.out.println(b.next); // 1 -> 2 -> 3  4
//        System.out.println(c.data);
//        System.out.println(c.next); // 1 -> 2 -> 3 -> 4
//        System.out.println(d.data); // 4
//        System.out.println(d.next); // null ( tail node )

        // display a linked-list by using for loop

        Node temp = a; // in this case i am not creating a linked list node
//        System.out.println(temp.data); // 1

        // using for loop
//        for( int i=1; i<=4; i++){
//            System.out.println(temp.data);
//            temp = temp.next; // pointing to the next Node address
//        }

        // using while loop
        while( temp!=null ){
            System.out.println(temp.data);
            temp = temp.next;
        }

        // using function
        display(a);
        // using recursive function
        displayRec(a);


    }
}
