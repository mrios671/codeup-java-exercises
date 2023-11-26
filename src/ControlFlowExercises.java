import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){
//        int i = 5;
//        while(i<=15){
//            System.out.println(i);
//            i++;
//        }

//        for(int i = 5; i<=15; i++){
//            System.out.println(i);
//        }

//        int i = 0;
//        do{
//            System.out.println(i);
//            i+= 2;
//        }while(i <= 100);

//        for(int i = 0; i<=100; i += 2){
//            System.out.println(i);
//        }

//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);

//        for(int i = 100; i>=-10; i-=5){
//            System.out.println(i);
//        }

//        long i = 2;
//        do{
//            System.out.println(i);
//            i*=i;
//        }while(i <= 1000000);

//        for(long i = 2; i<=1000000; i*=i){
//            System.out.println(i);
//        }

//        FIZZBUZZ
//        for(int i = 1; i<= 100; i++){
//
//            if(i % 15 == 0){
//                System.out.println("fizzbuzz");
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else{
//                System.out.println(i);
//            }
//        }

        // Table of Powers

        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.print("What number would you like to go up to? ");
            //lets the user input a number
            int number = myScanner.nextInt();
            //general format of the table
            System.out.println("\nHere is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            //loop that takes in the users input, inputs it into the formatted table, multiplies that inputted integer to be squared or cubed, and loops through the numbers 1 to what the user inputs to populate the table
            for (int i = 1; i <= number; i++) {
                System.out.printf("%5d | %7d | %6d%n", i, i * i, i * i * i);
            }
            System.out.print("Would you like to continue? (yes/no) ");
            String response = myScanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }
        //closes the scanner
        myScanner.close();


        //Convert number grades into letter grades
        boolean continueFlagGrade = false;

        do {
            System.out.println("Hello ! please give me your grade (0 - 100)");

            int userGrade = myScanner.nextInt();

            if (userGrade > 88) {
                System.out.println("You got an A");
            } else if (userGrade > 80) {
                System.out.println("You got a B");
            } else if (userGrade > 67) {
                System.out.println("You got a C");
            } else if (userGrade > 60) {
                System.out.println("You got a D");
            } else {
                System.out.println("You need to study more :(");
            }

            System.out.println("Do you have another grade to convert? YES/NO");
            myScanner.nextLine();
            String userAnswer = myScanner.nextLine();

            if (userAnswer.toLowerCase().equals("yes")) {
                continueFlagGrade = true;
            } else {
                continueFlagGrade = false;
            }
        }
        while(continueFlagGrade);


    }
}
