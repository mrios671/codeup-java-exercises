import java.util.Arrays;

public class ArraysExercises {

    public static void addPerson(Person[] personArray, Person Single){
        System.out.println("Array contents printed through method: ");
//        Person[] newArray = new Person[4];
//        Person p4 = new Person("Cocoa");
        Person[] newArray = Arrays.copyOf(personArray, personArray.length + 1);
        System.out.println(newArray.length - 1);
        //add sin;g obj to replace null
        newArray[newArray.length-1] = Single;

        for(int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i].getName() + " ");
        }

    }

    public static void main(String[] args) {
        //This outputs just the array id
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        String[] person = {"Joel", "Nani", "Lindsey"};
//        // System.out.println(people.length);
//        System.out.println(person[0]);
//        System.out.println(person[1]);
//        System.out.println(person[2]);

        Person p1 = new Person("Joel");
        Person p2 = new Person("Nani");
        Person p3 = new Person("Lindsey");

        Person[] people = new Person[3];

        people[0] = p1;
        people[1] = p2;
        people[2] = p3;

        System.out.println(people[0].getName());
        System.out.println(people[1].getName());
        System.out.println(people[2].getName());

        Person Single = new Person("Cocoa");
        addPerson(people, Single);
    }
}
