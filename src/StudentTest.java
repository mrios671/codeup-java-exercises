public class StudentTest {
    public static void main(String[] args) {
        Student studentGrades = new Student("Nani");

        studentGrades.addGrade(98);
        studentGrades.addGrade(85);
        studentGrades.addGrade(87);
        studentGrades.addGrade(94);
        studentGrades.addGrade(82);

        System.out.println(studentGrades.getName() + "'s average grade is: " + studentGrades.getGradeAverage());

        studentGrades.addGrade(100);
        System.out.println(studentGrades.getName() + "'s updated average grade is: " + studentGrades.getGradeAverage());

    }

}
