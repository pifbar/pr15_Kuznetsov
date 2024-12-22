package MyPackage;
import java.util.ArrayList;
import java.util.Collections;


public class Shaffle {
    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);
        shuffle(numbers);
        System.out.println(numbers);
    }
}