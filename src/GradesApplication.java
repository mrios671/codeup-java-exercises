import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Scanner localScanner = new Scanner(System.in);
        boolean continueFlag = false;

        Student student1 = new Student("Luffy");
        Student student2 = new Student("Zoro");
        Student student3 = new Student("Nami");
        Student student4 = new Student("Sanji");

        student1.addGrade(75);
        student1.addGrade(85);
        student1.addGrade(81);

        student2.addGrade(98);
        student2.addGrade(87);
        student2.addGrade(95);

        student3.addGrade(83);
        student3.addGrade(90);
        student3.addGrade(86);

        student4.addGrade(79);
        student4.addGrade(80);
        student4.addGrade(84);

        students.put("pirateking", student1);
        students.put("gr8estSwordsman", student2);
        students.put("navig8or", student3);
        students.put("allbluechef", student4);

        System.out.println("Grades Application");
        System.out.printf("%n");

        do{
            System.out.println("Here is a list of the registered students");
            for(String username : students.keySet()){
                System.out.printf(" |%s| ", username);
            }

            System.out.printf("%n%n");
            System.out.println("Which student's information would you like to look up? :");
            String userInput = localScanner.nextLine();

            if(students.keySet().contains(userInput)){
                Student foundStudent = students.get(userInput);
                System.out.printf("Name: %s - GitHub Username: %s%n" +
                        "Current Average: %.2f%n", foundStudent.getName(), userInput, foundStudent.getGradeAverage());
            } else {
                System.out.printf("%s not found%n", userInput);
            }

            System.out.println("Would you like to search for another student? > Y/N <");
            String userAnswer = localScanner.nextLine();

            if(userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")){
                continueFlag = true;
            } else {
                continueFlag = false;
            }

        }while (continueFlag);

    }
}
