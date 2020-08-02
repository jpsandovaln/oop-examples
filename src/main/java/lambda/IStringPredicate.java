package lambda;

public interface IStringPredicate<T> {
    boolean isValid(T value);
}
