package OOPS_Concepts.Inheritence;

// Multi-Level Inheritance

class A{
    int id=101;
    void printA(){
        System.out.println("Hello class A method!");
    }
}

class B extends A{
    void printB(){
        System.out.println("Hello class B method!");
    }
}

class C extends B{
    void printC(){
        System.out.println("Hello class C method!");
    }
    void Id(){
        System.out.println("id of class A is: "+id);
    }
}

public class multiLevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.printA();
        obj.printB();
        obj.printC();
        obj.Id();

    }
}
