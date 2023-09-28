import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        //Question 1
        //double pi = 3.14159;
        //System.out.printf("The value of pi is approximately %.2f" , pi);

        Scanner myScanner = new Scanner(System.in);

        //Question 2
        //System.out.println("What is your favorite number?");
        //int userAnswer =myScanner.nextInt();

        //System.out.println("Wow! " + userAnswer + " is my favorite number too!");

        //Question 3
        //System.out.print("Enter your first word:");
        //String first = myScanner.nextLine();

        //System.out.print("Enter your second word:");
        //String second = myScanner.nextLine();

        //System.out.print("Enter your third word:");
        //String third = myScanner.nextLine();

        //System.out.println("You entered the following words:");
        //System.out.println(first);
        //System.out.println(second);
        //System.out.println(third);

        //Question 4
        System.out.println("Enter the length: ");
        int length = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter the width: ");
        int width = Integer.parseInt(myScanner.nextLine());

        System.out.println("The area of the rectangle is: ");
        System.out.println(length * width);

        System.out.println("The perimeter of the rectangle is : ");
        System.out.println((2 * length)+ (2 * width));

    }
}
