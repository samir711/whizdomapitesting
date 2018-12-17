package Day5.InheritanceExample;

public class Animal {

    String movementType = "any Movement";

    public void move(String movementType){
        System.out.println(movementType);
    }
    public void move(String movementType, String somevar){

        System.out.println(movementType + somevar);
    }

    public static void main(String[] args) {

        Animal obj = new Animal();
        obj.move("any","walk");

    }
}
