public class Clothing{
    public String type;
    public String color;
    public String size;

    public static void main(String[] args) {
        Clothing nanisOutfit = new Clothing();
        nanisOutfit.type = "sweater";
        nanisOutfit.color = "maroon";
        nanisOutfit.size = "large";

        System.out.printf("My %s is the color %s and is a size %s%n", nanisOutfit.type, nanisOutfit.color, nanisOutfit.size);
    }
}

