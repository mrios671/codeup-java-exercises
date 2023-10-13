package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String movieName, String movieCategory){
        this.name = movieName;
        this.category = movieCategory;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    public String toString(){
//        return String.format("Name: $s -- Category: $s", this.name, this.category);
//    }
//        public String getInfo(){
//        return String.format("Name: %s -- Category: %s", this.name, this.category);
//    }


    //Below is a main method that I used to test whether the methods actually worked before I moved forward.

    public static void main(String[] args) {
//        Movie favMovie = new Movie("50 First Dates", "Romance/Comedy");
//        System.out.printf(favMovie.getInfo());



    }
}
