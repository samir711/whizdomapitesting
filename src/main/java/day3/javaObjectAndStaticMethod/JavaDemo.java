package day3.javaObjectAndStaticMethod;

public class JavaDemo {

    int id;
    String name;

    public JavaDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }
//
//    public void PrintStudentData(String studentName, int studentId) {
//
//        System.out.println("Student Data : " + "Name is : " + studentName + " Student Id is : " + studentId);
//    }

    public void PrintStudentData() {
        System.out.println("Student Data - " + "Name is : " + name + " Student Id is : " + id);
    }

    public static void main(String[] args) {

        JavaDemo obj_java_demo_one = new JavaDemo(18, "Alex");
//        obj_java_demo_one.id = 7;
//        obj_java_demo_one.name = "Alex";

        JavaDemo obj_java_demo_two = new JavaDemo(19, "John");
//        obj_java_demo_two.id = 18;
//        obj_java_demo_two.name = "Sam";

        obj_java_demo_one.PrintStudentData();
        obj_java_demo_two.PrintStudentData();

//        System.out.println("First Student is : " + obj_java_demo_one.name + " " + obj_java_demo_one.id);
//        System.out.println("Second Student is : " + obj_java_demo_two.name + " " + obj_java_demo_two.id);

    }
}
