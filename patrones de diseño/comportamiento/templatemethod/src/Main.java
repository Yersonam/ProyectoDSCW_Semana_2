// Client
public class Main {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
        // Output:
        // Executing step 1...
        // Executing step 1 in ConcreteClass.
        // Executing step 2...
        // Executing step 2 in ConcreteClass.
        // Template method execution complete.
    }
}