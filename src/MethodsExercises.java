public class MethodsExercises {
    public static void main(String[] args){
        System.out.println(addition(2,7));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(5, 5));
        System.out.println(division(9, 3));
    }
    public static Integer addition(int input1, int input2){
        return input1 + input2;
    }
    public static Integer subtraction(int input1, int input2){
        return input1 - input2;
    }
    public static Integer multiplication(int input1, int input2){
        return input1 * input2;
    }
    public static Integer division(int input1, int input2){
        return input1/input2;
    }
}
