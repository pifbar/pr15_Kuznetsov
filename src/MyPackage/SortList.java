package MyPackage;
import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(4);
        numbers.add(3);
        numbers.add(9);

        System.out.println(numbers);
        sort(numbers);
        System.out.println(numbers);
    }
}