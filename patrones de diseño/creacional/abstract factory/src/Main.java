// Client
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.operationA();  // "Operation A from ConcreteProductA1"
        productB1.operationB();  // "Operation B from ConcreteProductB1"

        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.operationA();  // "Operation A from ConcreteProductA2"
        productB2.operationB();  // "Operation B from ConcreteProductB2"
    }
}