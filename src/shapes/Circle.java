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

}
