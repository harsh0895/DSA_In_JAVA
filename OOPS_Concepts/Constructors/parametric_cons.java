package OOPS_Concepts.Constructors;
// Implement parametric constructor

class student{
    int id;
    String name;
    student(){
        System.out.println("default constructor!");
        this.id = 1;
        this.name = "harsh";
    }
    student( int Id, String Name ){
        System.out.println("Parametric constructor");
        this.id = Id;
        this.name = Name;
    }
    void print(){
        System.out.println("Id is: "+id);
        System.out.println("Name is: "+name);
    }
}

public class parametric_cons {
    public static void main(String[] args) {
        // default constructor call
        student obj = new student();
        obj.print();

        // parametric constructor call
        student obj1 = new student(2, "Aman");
        obj1.print();
    }
}
