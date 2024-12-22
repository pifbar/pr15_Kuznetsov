package MyPackage;

public class Triplet<A extends Comparable<A>> {
    private final A first;
    private final A second;
    private final A third;

    public Triplet(A first, A second, A third) {
        this.first = first;
        this.second = second;
this.third = third;
    }

public boolean contains(A element) {
    return first.equals(element) || second.equals(element) || third.equals(element);
}

public A getMin() {
    A min = first;
    if (second.compareTo(min) < 0) {
        min = second;
    }
    if (third.compareTo(min) < 0) {
        min = third;
    }
    return min;
}

public String sum() {
    if (first instanceof Number && second instanceof Number && third instanceof Number) {
        return String.valueOf(((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue());
    } else {
        return first + " " + second + " " + third;
    }
}

public static void main(String[] args) {
    Triplet<Integer> numberTriplet = new Triplet<>(1, 2, 3);
    System.out.println("Содержит 2 = " + numberTriplet.contains(2));
    System.out.println("Наименьший элемент = " + numberTriplet.getMin());
    System.out.println("Сумма элементов = " + numberTriplet.sum());
}
}