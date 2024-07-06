package OOPS_Concepts.Constructors;

// Implement default constructor
class third{
    int n1;
    int n2;
    third(){
        this.n1 = 1;
        this.n2 = 2;
    }
    public void sum(){
        System.out.println(n1+n2);
    }
}
public class default_cons {
    public static void main(String[] args) {
        third obj = new third();
        obj.sum();
    }
}
