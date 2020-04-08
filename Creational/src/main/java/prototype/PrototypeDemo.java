package prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational paterns in java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getUrl());
        System.out.println(movie.getTitle());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of four");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getUrl());
        System.out.println(anotherMovie.getTitle());

    }
}
