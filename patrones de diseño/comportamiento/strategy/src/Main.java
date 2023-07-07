// Client
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        // Set strategy A
        context.setStrategy(new ConcreteStrategyA());
        context.execute();
        // Output:
        // Executing strategy A.

        // Set strategy B
        context.setStrategy(new ConcreteStrategyB());
        context.execute();
        // Output:
        // Executing strategy B.
    }
}