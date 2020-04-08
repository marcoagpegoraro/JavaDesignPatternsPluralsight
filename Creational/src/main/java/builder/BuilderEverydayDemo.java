package builder;

public class BuilderEverydayDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("ola");

        builder.append("meu nome é");

        builder.append("marco antonio");

        builder.append("prazer em conhecer");

        System.out.println(builder.toString());
    }
}
