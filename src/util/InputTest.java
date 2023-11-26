package util;

import java.util.InputMismatchException;

public class InputTest {
    public static void main(String[] args) {
        Input stringInput = new Input();
        String testString = stringInput.getString();
        System.out.println(testString);

        Input boolInput = new Input();
        boolean boolString = boolInput.yesNo();
        System.out.println(boolString);

        Input intInput = new Input();
        int test = intInput.getInt(1, 10);
        System.out.println(test);

        Input getIntInput = new Input();
        int testTwo = getIntInput.getInt();
        System.out.println(testTwo);

        Input getDbl = new Input();
        double dblTest = getDbl.getDouble(1.00, 10.00);
        System.out.println(dblTest);

        Input getSingleDouble = new Input();
        double dblTestTwo = getSingleDouble.getDouble();
        System.out.println(dblTestTwo);
    }
}
