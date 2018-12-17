package Day6.accessmodifiers.package1;

public class A {

     protected void method1() {

        System.out.println("Method from Class A");
    }

    public static void main(String[] args) {

        A obj = new A();
        obj.method1();
    }

}
