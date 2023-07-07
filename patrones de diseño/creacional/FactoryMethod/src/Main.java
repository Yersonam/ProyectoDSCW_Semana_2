// Client class
public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.operation();  // "Operation from ConcreteProductA"

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.operation();  // "Operation from ConcreteProductB"
    }
}