// Client
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
        // Output:
        // Subsystem1: operation1()
        // Subsystem2: operation2()
        // Subsystem3: operation3()
    }
}