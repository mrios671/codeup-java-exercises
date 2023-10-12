package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(length, 2);
    }

    @Override
    void setLength(double side) {
        setLength(side);
        this.length = side;
    }

    @Override
    void setWidth(double side) {
        setWidth(side);
        this.width = side;
    }

//    private int side;
//
//    public Square(int side) {
//        super(side, side);
//    }
//
//    public int getArea(){
//        return (int) Math.pow(length, 2);
//    }
//    public int getPerimeter(){
//        return 4 * width;
//    }
}
