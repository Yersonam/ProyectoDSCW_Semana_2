// Client
public class Main {
    public static void main(String[] args) {
        Implementor implementorA = new ConcreteImplementorA();
        Abstraction abstractionA = new RefinedAbstractionA(implementorA);
        abstractionA.operation();
        // Output:
        // Operation in RefinedAbstractionA
        // Operation implementation from ConcreteImplementorA

        Implementor implementorB = new ConcreteImplementorB();
        Abstraction abstractionB = new RefinedAbstractionB(implementorB);
        abstractionB.operation();
        // Output:
        // Operation in RefinedAbstractionB
        // Operation implementation from ConcreteImplementorB
    }
}