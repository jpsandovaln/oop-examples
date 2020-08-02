package interfaces;

/**
 * @author HP
 * @version 1.1
 */
public class CalcularEnteros implements ICalculador {
    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    @Override
    public int restar(int a, int b) {
        return 0;
    }
}
