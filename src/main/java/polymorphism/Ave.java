package polymorphism;

/**
 * @author HP
 * @version 1.1
 */
public class Ave extends Animal {
    public Ave(String name, String color) {
        super(name, color);
    }

    // @Override
    public void desplazar() {
        System.out.println("volando");
    }
}
