package day8.regexpression;

import java.util.regex.Pattern;

public class TestRegex {

    public static void main(String[] args) {

    /*      String inputString = "1542 RoyalRoad London";
            String regExpression = "^\\d{3,5}\\s\\w+\\s\\w+$";

            System.out.println(Pattern.matches(regExpression, inputString));
    */

    //      alpha numeric char and length should be only 6 chars only

    /*      String inputStringOne = "Abh765";
            String regExpressOne = "^[a-zA-Z0-9]{6}$";

            System.out.println(Pattern.matches(regExpressOne, inputStringOne));
    */


    // pattern that hold 10 digits , should start with either 9 or 8 or 7

        String inputStringTwo = "9897200000";
        String regExpressionTwo = "^[987][0-9]{9}$";
        System.out.println(Pattern.matches(regExpressionTwo, inputStringTwo));


    }
}
