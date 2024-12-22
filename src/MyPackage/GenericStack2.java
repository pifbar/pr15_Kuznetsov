package MyPackage;

import java.util.ArrayList;

public class GenericStack2<E> extends ArrayList<E> {

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    public void push(E o) {
        add(o);
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return remove(size() - 1);
    }

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}