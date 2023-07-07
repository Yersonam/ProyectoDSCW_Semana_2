// Client
public class Main {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");
        Component leaf3 = new Leaf("Leaf 3");

        Component composite = new Composite();
        ((Composite) composite).addComponent(leaf1);
        ((Composite) composite).addComponent(leaf2);

        Component composite2 = new Composite();
        ((Composite) composite2).addComponent(leaf3);

        ((Composite) composite).addComponent(composite2);

        composite.operation();
        // Output:
        // Composite:
        // Leaf: Leaf 1
        // Leaf: Leaf 2
        // Composite:
        // Leaf: Leaf 3
    }
}