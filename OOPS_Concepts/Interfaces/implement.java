package OOPS_Concepts.Interfaces;

// Implementation of Interfaces

interface base{
    void say();
}

class derived implements base{
    @Override
    public void say() {
        System.out.println("Hello world!");
    }
    void greet(){
        System.out.println("Good Morning!");
    }
}
public class implement {
    public static void main(String[] args) {
        derived obj = new derived();
        obj.say();
        obj.greet();

    }
}
