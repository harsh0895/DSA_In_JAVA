package OOPS_Concepts.Interfaces;

// Multiple Inheritance
interface one{
    void greet();
}

interface two{
    void greet();
}

class three implements one, two{
    @Override
    public void greet() {
        System.out.println("Good Morning!");
    }
}

public class multiple_Inheritence {
    public static void main(String[] args) {
        three obj = new three();
        obj.greet();

    }
}
