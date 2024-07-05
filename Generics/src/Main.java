import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }

            String[] commandParts = command.split("\\s+");
            String action = commandParts[0];

            switch (action) {
                case "Add":
                    customList.add(commandParts[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(commandParts[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(commandParts[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(commandParts[1]), Integer.parseInt(commandParts[2]));
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(commandParts[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.print();
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
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
