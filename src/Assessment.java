import java.util.ArrayList;
import java.util.List;

public class Assessment {
    public static int half(int num) {
        return num / 2;
    }

    public static String shout(String string) {
        return string.toUpperCase() + "!!!";
    }

    public static List<Animal> removeCats(List<Animal> animals) {
        List<Animal> filteredAnimals = new ArrayList<>();

        for (Animal animal : animals) {
            if (!animal.getSpecies().equals("Felis catus")) {
                filteredAnimals.add(animal);
            }
        }
        return filteredAnimals;
    }

    public static void main(String[] args) {
        System.out.println(half(18));
        System.out.println(shout("Hello world"));

        removeCats();
    }
}
