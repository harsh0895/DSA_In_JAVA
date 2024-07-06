package OOPS_Concepts;

class mo1{
    void p1(int a){
        System.out.println(a);
    }
    void p1(int a, int b){
        System.out.println(a + b);
    }
    void p1(int a, int b, int c){
        System.out.println(a + b + c);
    }
}

class mo2 extends mo1{
    void print(){
        System.out.println("Hello from mo2!");
    }
}
public class Method_Overloading {
    public static void main(String[] args) {
        mo2 obj = new mo2();
        obj.print();
        obj.p1(1);
        obj.p1(1,2);
        obj.p1(1,2,3);

    }
}
