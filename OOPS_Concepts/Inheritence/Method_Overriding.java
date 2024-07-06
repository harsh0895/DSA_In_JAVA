package OOPS_Concepts.Inheritence;

class m1{
    void print(){
        System.out.println("Hello");
    }
}

class m2 extends m1{
    @Override
    void print() {
        System.out.println("Hello Bro");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        m2 obj = new m2();
        obj.print();
    }
}
