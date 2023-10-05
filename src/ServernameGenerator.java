import java.util.Random;
public class ServernameGenerator {

    public static String randomString(String[] array1, String[] array2){
        Random random = new Random();
        int index = random.nextInt(array1.length);
        int index2 = random.nextInt(array2.length);
        System.out.println("Here is your server name: " + array1[index] + "-" + array2[index2]);
        return array1[index] +" "+  array2[index2];
    }


    public static void main(String[] args) {
        String[] adjectives = {"hanging", "stimulating", "holistic", "inner", "mean", "fertile", "descriptive", "standing", "common", "long"};
        String[] nouns = {"village", "topic", "reality", "membership", "distribution", "army","owner", "tooth", "instance", "community"};

        randomString(adjectives, nouns);

    }

}
