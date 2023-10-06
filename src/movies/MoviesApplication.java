package movies;


import util.Input;


public class MoviesApplication {


    public static void main(String[] args) {
        //userInput scans for what the user entered
        //need to make a conditional statement that displays information based on the users input
        //make it to where it continues to run until the user decides to exit.
        Input userInput = new Input();

        while (true) {

            System.out.println("What would you like to do?");
            System.out.println("0 - Exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - View movies within the Animated category");
            System.out.println("3 - View movies within the Drama category");
            System.out.println("4 - View movies within the Horror category");
            System.out.println("5 - View movies within the SciFi category");
            System.out.println("6 - View movies within the Musical category");
            System.out.println("7 - View movies within the Comedy category");

            int userSelection = userInput.getInt(0, 7);

            if (userSelection == 0) {
                System.out.println("Thank you, Goodbye!");
                break;
            }

            Movie[] movies = MoviesArray.findAll();



        }
    }
}