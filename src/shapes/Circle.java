package shapes;

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getCircumfrence(){
        return 2 * Math.PI * radius;
    }
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
