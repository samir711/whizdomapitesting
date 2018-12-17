package day7.exceptionhandling;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class TestException {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {

            int[] arr = new int[4];

            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 1;
            arr[3] = 1;
          //  arr[4] = 1;

            System.out.println("Enter the first Number");
            int a = s.nextInt();
            System.out.println("Enter the second Number");
            int b = s.nextInt();

            int result = a / b;
            System.out.println("Division is " + result);
        } catch (Exception e){
            System.out.println("You can do this");
        }
        finally {
            System.out.println("Finally block");
        }

//        catch (ArithmeticException e) {
//            System.out.println("You cannot divide any number by zero");
//        }
//
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("You are adding value beyond the size of array");
//        }

        System.out.println("Rest of the code .....");

    }


}
