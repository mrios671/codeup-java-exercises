import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {
    public static Scanner localScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(addition(2, 7));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(5, 5));
        System.out.println(division(9, 3));
        System.out.println(modulus(2,2));

        System.out.println(getInteger(1,10));

        factorialPrint();
        randomDie();

    }

    //Question 1
    public static Integer addition(int input1, int input2) {
        return input1 + input2;
    }

    public static Integer subtraction(int input1, int input2) {
        return input1 - input2;
    }

    public static Integer multiplication(int input1, int input2) {
        return input1 * input2;
    }

    public static Integer division(int input1, int input2) {
        return input1 / input2;
    }
    public static Integer modulus(int input1, int input2){
        return input1 % input2;
    }

    //Question 2
//    Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range. If the input is invalid, prompt the user again.
    public static int getInteger(int min, int max) {
        System.out.println("Please enter a number between 1 and 10");
        int userInput = localScanner.nextInt();

        if(userInput < min || userInput > max){
            System.out.println("That number is invalid... please try again...");
            return getInteger(min, max);
        }
        return userInput;
    }
    //Question 3
    public static void factorialPrint(){
        int myUsersNum = getInteger(1, 10);
        String myOutput = "1";
        int mathBucket = 1;

        for (int i = 1; i <= myUsersNum; i++) {
            if(i == 1){
                System.out.printf("%d! = %-16s = %d%n", i, myOutput, mathBucket);
                continue;
            }

            mathBucket *= i;
            myOutput += " x " + i;

            System.out.printf("%d! = %-16s = %d%n", i, myOutput,mathBucket);

        }

    }
    //Question 4
    public static void randomDie(){
        System.out.println("Enter the number of dice: ");
        int num = localScanner.nextInt();

        while(num <=0){
            System.out.println("The number of dice can't be 0 or negative");
            System.out.println("Enter the number of dice: ");
            num = localScanner.nextInt();
        }

        Random rand = new Random();
        do{
            System.out.println("The values on the dice are: ");
            for(int i = 0; i < num; i++){
                System.out.println(rand.nextInt(6)+1);
            }
            System.out.println("Do you want to roll the dice again? true or false?");
        } while(localScanner.nextBoolean()== true);
        localScanner.close();
    }

}
