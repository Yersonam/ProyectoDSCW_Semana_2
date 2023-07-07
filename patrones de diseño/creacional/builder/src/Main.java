// Client
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        director.constructProduct(builder);

        Product product = builder.getProduct();
        product.printProduct();
    }
}