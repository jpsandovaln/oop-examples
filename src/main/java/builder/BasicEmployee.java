package builder;

/**
 * @author HP
 * @version 1.1
 */
public class BasicEmployee implements IBuilderEmployee {
    private Employee employee;

    public BasicEmployee(int id, int ci, String firstName, String lastName) {
        this.employee = new Employee(id, ci, firstName, lastName);
    }

    public BasicEmployee age(int age) {
        this.employee.setAge(age);
        return this;
    }

    @Override
    public Employee build() {
        return this.employee;
    }
}
