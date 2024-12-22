package MyPackage;

public class GenericStack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;

    public GenericStack() {
        this(DEFAULT_CAPACITY);
    }

    public GenericStack(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (size == 0) {
            return null;
        }
        return elements[size - 1];
    }

    public void push(E o) {
        if (size >= elements.length) {
            E[] newElements = (E[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = o;
    }

    public E pop() {
        if (size == 0) {
            return null;
        }
        E o = elements[--size];
        elements[size] = null; // для сборки мусора
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("стек: [");
        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}