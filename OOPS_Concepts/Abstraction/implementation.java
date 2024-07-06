package OOPS_Concepts.Abstraction;

// Implementation of Abstraction

abstract class base{
    void say(){
        System.out.println("Hello user!");
    }
    abstract public void greet();
}

class derived extends base{
    @Override
    public void greet() {
        System.out.println("Good Morning!");
    }

    void run(){
        System.out.println("How are you ?");
    }
}
public class implementation {
    public static void main(String[] args) {
        derived obj = new derived();
        obj.say();
        obj.greet();
        obj.run();

    }
}
