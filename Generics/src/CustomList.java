import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> items;

    public CustomList() {
        this.items = new ArrayList<>();
    }

    private boolean checkIndex(int index) {
        return !this.items.isEmpty() && index >= 0 && index < this.items.size();
    }

    public void add(T element) {
        this.items.add(element);
    }

    public T remove(int index) {
        if (!checkIndex(index)) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }

        return this.items.remove(index);
    }

    public boolean contains(T element) {
        return this.items.contains(element);
    }

    public void swap(int index1, int index2) {
        if (!checkIndex(index1) || !checkIndex(index2)) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }

        Collections.swap(this.items, index1, index2);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T item : items) {
            if (item.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        return Collections.max(items);
    }

    public T getMin() {
        return Collections.min(items);
    }

    public void print() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
