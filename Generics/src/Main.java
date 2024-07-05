import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static <T> void swapElementsOfList(List<T> list, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= list.size() || index2 >= list.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        T temp = list.get(index2);
        list.set(index2, list.get(index1));
        list.set(index1, temp);
    }

    public static <T extends  Comparable<T>> int countGreaterThan(List<T> list, T element) {
        int count = 0;
        for (T item : list) {
            if (item.compareTo(element) > 0) {
                count++;
            }
        }

        return count;
    }
}
