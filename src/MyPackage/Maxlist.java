package MyPackage;
import java.util.ArrayList;

public class Maxlist {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не может быть пустым");
        }

        E max = list.get(0);

        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);

        Integer maxNumber = max(numbers);
        System.out.println(numbers);
        System.out.println(maxNumber);

    }
}