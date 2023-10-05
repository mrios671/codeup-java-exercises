package shapes;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a radius to be calculated: ");
        double radius = scanner.nextDouble();
        Circle userCircle = new Circle(radius);

        double calculatedCircumfrence = userCircle.getCircumfrence();
        double calculatedArea = userCircle.getArea();

        System.out.println("The circumfrence for the radius that you entred is: " + calculatedCircumfrence);
        System.out.println("The area for the radius that you entered is: " + calculatedArea);
    }
}
