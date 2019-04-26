package prsen;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Product product =
            Product
                .builder()
                .id(1l)
                .name("Kubek")
                .description("Czarny")
                .build();
    }
}
