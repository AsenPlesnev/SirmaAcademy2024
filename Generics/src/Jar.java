import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> {
    private final Deque<T> elements;

    public Jar() {
        this.elements = new ArrayDeque<>();
    }

    public void add(T element) {
        this.elements.push(element);
    }

    public T remove() {
        if (this.elements.isEmpty()) {
            return null;
        }

        return this.elements.pop();
    }
}
