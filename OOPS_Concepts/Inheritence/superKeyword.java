package OOPS_Concepts.Inheritence;

class parent{
    parent(){
        System.out.println("This is a parent class constructor!");
    }
    parent( int a){
        System.out.println("The value of a is: "+a);
    }
}

class child extends parent{
    child(){
        // if you want to access the parent class constructor from this derived class default constructor you can use super keyword!
        super(2);
        System.out.println("This is child class constructor!");
    }
}
public class superKeyword {
    public static void main(String[] args) {
        child obj = new child();

    }
}
