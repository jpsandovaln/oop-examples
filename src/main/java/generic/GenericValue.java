package generic;

/**
 * @author HP
 * @version 1.1
 */
public class GenericValue<T> {
    private T value;

    public GenericValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
