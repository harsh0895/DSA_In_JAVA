package LinkedList;

// Implement a method to insert a node at the end of the Linked list

public class LL_2 {
    public static class Node {
        int data;
        Node next;
        Node( int data){
            this.data = data;
        }
    }
    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtStart(int val) {
            Node temp = new Node(val);
            if( head == null){
                head = temp;
                tail = temp;
            }
            else {
                temp.next = head;
                head = temp;
            }
        }
        void insertAtEnd( int val ){
            Node temp = new Node(val);
            if( head == null ){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }

        void display(){
            Node temp = head;
            while ( temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        void size(){
            int length = 0;
            Node temp = head;
            while ( temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
                length++;
            }
            System.out.println();
            System.out.println("Size is: "+length);
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtStart(4);
        ll.display();
        ll.size();
    }
}
