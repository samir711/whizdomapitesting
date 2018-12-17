package day3.javaObjectAndStaticMethod;

public class Planet {

    String name;

    static String shape = "Circle";

    static void PrintPlantInfo(String planetName, String planetShape) {
        System.out.println("Planet name is  " + planetName + " and Shape is " + planetShape);
    }

    public static void main(String[] args) {
        Planet p1 = new Planet();
        p1.name = "Earth";

        Planet p2 = new Planet();
        p2.name = "Mars";

        Planet p3 = new Planet();
        p3.name = "Jupiter";

   //     p1 = p2;
        PrintPlantInfo(p1.name, shape);
        PrintPlantInfo(p2.name, shape);
        PrintPlantInfo(p3.name, shape);

//        System.out.println("Name is : "+ p1.name + " Shape is : " + shape);
//        System.out.println("Name is : "+ p2.name + " Shape is : " + shape);
//        System.out.println("Name is : "+ p3.name + " Shape is : " + shape);
    }
}
