package MyPackage;

public class BigSearch {
    public static <E extends Comparable<E>> E max(E[] list) {
        if (list == null || list.length == 0) {
            return null;
        }

        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Circle[] circles = {new Circle(3.0), new Circle(1), new Circle(5), new Circle(4.5)};
        Circle largestCircle = max(circles);
        System.out.println("Наибольший элемент: " + largestCircle);
    }
}