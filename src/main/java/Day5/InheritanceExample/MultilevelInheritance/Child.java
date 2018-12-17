package Day5.InheritanceExample.MultilevelInheritance;

public class Child extends Parent {

    void firstName(){
        System.out.println("Alex");
    }

    public static void main(String[] args) {

        Child obj = new Child();
        obj.firstName();
        obj.LastName();
    }

}
