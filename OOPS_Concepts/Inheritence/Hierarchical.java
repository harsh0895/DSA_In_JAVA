package OOPS_Concepts.Inheritence;

class one{
    int id = 1;
    String name = "Harsh";
}

class two extends one {
    void printTwo(){
        System.out.println("The id of one from two "+id);
        System.out.println("The name of one from two "+name);
    }
}

class three extends one{
    void printThree(){
        System.out.println("The id of one from three "+id);
        System.out.println("The name of one from three "+name);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        two obj1 = new two();
        obj1.printTwo();
        three obj = new three();
        obj.printThree();
    }
}
