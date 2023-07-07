// Client
public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        // Output:
        // ConcreteComponent: operation()

        System.out.println();

        Component decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();
        // Output:
        // ConcreteComponent: operation()
        // ConcreteDecoratorA: additionalOperation()

        System.out.println();

        Component decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.operation();
        // Output:
        // ConcreteComponent: operation()
        // ConcreteDecoratorA: additionalOperation()
        // ConcreteDecoratorB: additionalOperation()
    }
}