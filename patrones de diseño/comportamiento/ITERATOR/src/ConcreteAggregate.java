import java.util.ArrayList;
import java.util.List;
// Concrete Aggregate
class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}