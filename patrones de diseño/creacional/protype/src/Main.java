// Client
public class Main {
    public static void main(String[] args) {
        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        prototypeA.setAttribute("Prototype A");

        ConcretePrototypeA cloneA = (ConcretePrototypeA) prototypeA.clone();
        cloneA.printAttribute();  // "Attribute of ConcretePrototypeA: Prototype A"

        ConcretePrototypeB prototypeB = new ConcretePrototypeB();
        prototypeB.setNumber(10);

        ConcretePrototypeB cloneB = (ConcretePrototypeB) prototypeB.clone();
        cloneB.printNumber();  // "Number of ConcretePrototypeB: 10"
    }
}