package generic;

import java.awt.*;

/**
 * @author HP
 * @version 1.1
 */
public class Validation<T> implements ITestGeneric<T> {
    @Override
    public boolean validate(T value) {
        return value == null;
    }
}
