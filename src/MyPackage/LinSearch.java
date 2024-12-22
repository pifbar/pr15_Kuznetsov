package MyPackage;
public class LinSearch {
    public static <E> int linSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (key.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] list = {"bmw", "mercedes", "toyota", "skoda"};
        String key = "orange";
        String key1 = "toyota";
        int index = linSearch(list, key);
        int index1 = linSearch(list, key1);
        System.out.println("Элемент \"" + key + "\" найден на позиции: " + index);
        System.out.println("Элемент \"" + key1 + "\" найден на позиции: " + index1);
    }
}