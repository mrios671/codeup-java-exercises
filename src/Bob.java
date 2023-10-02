import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        boolean talkMore = true;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Talk to Bob...");

        do{
            String userInput = myScanner.nextLine();

            String question = "Sure.";
            String yell = "Whoa, chill out!";
            String empty = "Fine, be that way!";
            String anythingElse = "Whatever.";

            if (userInput.endsWith("?")) {
                System.out.println(question);
            } else if (userInput.endsWith("!")) {
                System.out.println(yell);
            } else if (userInput == ("")) {
                System.out.println(empty);
            } else {
                System.out.println(anythingElse);
            }

//            System.out.println("Do you want to ask Bob another question?");
//            myScanner.nextLine();
//            String userReply = myScanner.nextLine();
//
//            if(userReply.toLowerCase().equals("yes")){
//                talkMore =true;
//            }else{
//                talkMore =false;
//            }

        } while(talkMore);

    }
}
