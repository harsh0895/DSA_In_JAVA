package OOPS_Concepts.Interfaces;

interface A{
    void say();
}

interface B extends A{
    void greet();
}

class print implements B{
    @Override
    public void say() {
        System.out.println("Hello");
    }

    @Override
    public void greet() {
        System.out.println("Good Morning!");
    }
}
public class multilevel {
    public static void main(String[] args) {
        print obj = new print();
        obj.say();
        obj.greet();

    }
}
