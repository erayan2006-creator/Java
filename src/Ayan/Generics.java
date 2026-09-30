package Ayan;

public class Generics<T> {
    private T value;
    private T elements[];

    public Generics(T value, T[] elements) {
        this.value = value;
        this.elements = elements;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
