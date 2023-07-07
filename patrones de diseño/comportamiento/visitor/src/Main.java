// Client
public class Main {
    public static void main(String[] args) {
        Element[] elements = { new ConcreteElementA(), new ConcreteElementB() };

        Visitor visitor = new ConcreteVisitor();

        for (Element element : elements) {
            element.accept(visitor);
        }
        // Output:
        // Visitor visits ConcreteElementA.
        // Operation A on ConcreteElementA.
        // Visitor visits ConcreteElementB.
        // Operation B on ConcreteElementB.
    }
}