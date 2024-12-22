package MyPackage;

public class D2Search {
    public static <E extends Comparable<E>> E findMax(E[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        E max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].compareTo(max) > 0) {
                    max = array[i][j];
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Integer maxNumber = findMax(numbers);
        System.out.println(maxNumber);
    }
}