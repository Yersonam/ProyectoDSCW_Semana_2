// Client
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.doAction();
        // Output:
        // State A: Performing action and transitioning to State B.

        context.doAction();
        // Output:
        // State B: Performing action and transitioning back to State A.

        context.doAction();
        // Output:
        // State A: Performing action and transitioning to State B.
    }
}