package OOPS_Concepts;

// Creating your class and Object
class firstClass{
    int id = 1;
    String name;
    public void print(){
        System.out.println("Your id is: "+id);
        System.out.println("Your name is: "+name);
    }
}
public class class_making {
    public static void main(String[] args) {
        firstClass obj = new firstClass();
        obj.name = "Harsh";
        obj.print();
    }
}
