import java.util.List;
// Concrete Iterator
class ConcreteIterator<T> implements Iterator<T> {
    private List<T> items;
    private int position = 0;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.size();
    }

    public T next() {
        if (this.hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}