package Day5.InheritanceExample;

public class Dog extends Animal {

 // String movement = "Walking";

    @Override
    public void move(String movement){
        System.out.println(movement);

    }

    public static void main(String[] args) {
        Dog ob = new Dog();
        ob.move("Walking");

    }

//    void move(){
//        System.out.println("Moving....");
//    }
}
