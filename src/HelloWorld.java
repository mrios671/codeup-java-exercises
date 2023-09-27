public class HelloWorld {
    public static void main(String[] arguments){
        System.out.println("Hello, World!");

        // Question 1
        int myFavoriteNumber = 11;
        System.out.println(myFavoriteNumber);

        // Question 2
        String myString = "Practicing Java for Codeup exercises.";
        System.out.println(myString);

        //Question 3
        //String myString = 'Practicing Java for Codeup exercises.';
        //gave this error ---> java: unclosed character literal

        //Question 4
        //myString= 3.14159;
        //gave this error ---> java: incompatible types: double cannot be converted to java.lang.String

        //Question 5
        //long myNumber;
        //System.out.println(myNumber);
        //gave this error ---> java: variable myNumber might not have been initialized

        //Question 6
        //long myNumber = 3.14;
        //it gives an error because it cannot pass a number with a decimal in it

        //Question 7
        //long myNumber = 123L;
        //System.out.println(myNumber);
        //The L suffix tells the compiler that we have a long number literal - google

        //Question 8
        //long myNumber = 123;
        //System.out.println(myNumber);

        //Question 9
        //float myNumber = 3.14;
        //System.out.println(myNumber);

        //Question 10
        //int x = 5;
        //System.out.println(x++);
        //System.out.println(x);
        //this post decrements, which means it grabs the value of x first, and then displays the increment after it is initialized
        /*
        int x = 5;
        System.out.println(++x);
        System.out.println(x);
        */

        //Question 11
        //String class= "hello";
        //System.out.println(class);
        //if i tried declaring "class" as a variable it will not run because it is not a valid statement

        //Question 12
        //I expect the following code to output the string "three"

        //String theNumberThree = "three";
        //Object o = theNumberThree;

        //int three = (int) o;
        // it gave an error

       // int three = (int) "three";
        // this version only showed me a conversion error

        //Question 13

        //int x = 4;
        //x = x + 5;

        //int x = 4;
       // x +=5;
        //int x = 4+5

        //either or they output the same thing
        //System.out.println(x);

        //int x = 3;
        //int y = 4;
        //y = y * x;
        //x *= y;
        //System.out.println(x);

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;
        System.out.println(y);
        System.out.println(x);


    }
}
