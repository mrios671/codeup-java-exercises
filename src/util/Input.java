package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        return input;
    }

    public boolean yesNo(){
        System.out.println("Would you like to continue?");
        String userInput = scanner.nextLine();
        return userInput.equals("y") || userInput.equals("yes");
    }

    public int getInt(int min, int max){
//        System.out.println("Please enter a number between 1 and 10");
        System.out.println("Enter your choice: ");
        int userInput = scanner.nextInt();

        if(userInput < min || userInput > max){
            System.out.println("That number is invalid... please try again...");
            return getInt(min, max);
        }
        return userInput;
    }

    public int getInt(){
        try {
            System.out.println("Enter a Number: ");
            String userInput = getString();
            return Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            throw new InputMismatchException("Input is not a valid integer");
        }
    }

    public double getDouble(double min, double max){
        System.out.println("please enter a decimal number between 1 and 10");
        double userInput = scanner.nextDouble();

        if(userInput < min || userInput > max){
            System.out.println("That number is invalid... please try again...");
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble(){
        try {
            System.out.println("Enter a decimal number: ");
            String userInput = getString();
            return Double.valueOf(userInput);
        } catch (NumberFormatException e){
            throw new InputMismatchException("Input is not a valid decimal number");
        }
    }

}
