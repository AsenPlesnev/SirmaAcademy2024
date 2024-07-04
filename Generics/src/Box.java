import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private final List<T> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

    public void add(T item) {
        this.items.add(item);
    }

    public void remove(T item) {
        this.items.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T value : this.items) {
            sb.append(value.getClass().getName()).append(": ").append(value).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
