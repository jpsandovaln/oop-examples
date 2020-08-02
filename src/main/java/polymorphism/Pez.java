package polymorphism;

/**
 * @author HP
 * @version 1.1
 */
public class Pez extends Animal {
    public Pez(String name, String color) {
        super(name, color);
    }

    public void desplazar() {
        System.out.println("nadando");
    }

}
