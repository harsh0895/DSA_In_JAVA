package OOPS_Concepts.Inheritence;

// Single Inheritance

class base{
    int id = 1;
    String name = "Harsh";
}

class derived extends base{
    // taking id and name from the base class:-
    void print(){
        System.out.println("Id is: "+id);
        System.out.println("Name is: "+name);
    }
    void greet(){
        System.out.println("Hello good morning!");
    }
}

public class single {
    public static void main(String[] args) {
        derived obj = new derived();
        obj.print();
        obj.greet();
    }
}
