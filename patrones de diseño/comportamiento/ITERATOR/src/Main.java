// Client
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.addItem("Item 1");
        aggregate.addItem("Item 2");
        aggregate.addItem("Item 3");

        Iterator<String> iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Output:
        // Item 1
        // Item 2
        // Item 3
    }
}