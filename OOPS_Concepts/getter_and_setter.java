package OOPS_Concepts;

class second{
    private int id;
    private String name;

    // setters
    public void setId(int id){
        this.id = id;
    }
    public void setName( String name){
        this.name = name;
    }

    //getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class getter_and_setter {
    public static void main(String[] args) {
        second obj = new second();
        obj.setId(1);
        obj.setName("harsh");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
