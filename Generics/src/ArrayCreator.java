import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class ArrayCreator {
    public static <T> T[] Create(int length, T item) {
        T[] arr = (T[]) new Object[length];

        for (int i = 0; i < length; i++) {
            arr[i] = item;
        }

        return arr;
    }

    public static <T> T[] create(Class<T> type, int length, T item) {
        T[] arr = (T[]) Array.newInstance(type, length);

        for (int i = 0; i < length; i++) {
            arr[i] = item;
        }
        return arr;
    }
}
