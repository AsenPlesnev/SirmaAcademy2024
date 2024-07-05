public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {
    private final T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    @Override
    public String toString() {
        return this.item.getClass().getName() + (": ") + this.item;
    }

    @Override
    public int compareTo(Box<T> o) {
        return this.item.compareTo(o.item);
    }
}
