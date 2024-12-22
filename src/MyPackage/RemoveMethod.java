package MyPackage;

import java.util.ArrayList;

public class RemoveMethod {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E element : list) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("bmw");
        list.add("mercedes");
        list.add("toyota");
        list.add("skoda");
        list.add("bmw");

        System.out.println("Исходный список: " + list);
        ArrayList<String> uniqueList = removeDuplicates(list);
        System.out.println("Список без дубликатов: " + uniqueList);
    }
}