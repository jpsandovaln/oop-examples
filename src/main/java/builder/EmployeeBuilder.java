package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HP
 * @version 1.1
 */
public class EmployeeBuilder implements IBuilderEmployee {
    private Employee employee;
    private List<String> clients;

    public EmployeeBuilder(int id, int ci, String firstName, String lastName) {
        this.employee = new Employee(id, ci, firstName, lastName);
    }

    public EmployeeBuilder age(int age) {
        this.employee.setAge(age);
        return this;
    }

    public EmployeeBuilder phone(int phone) {
        this.employee.setPhone(phone);
        return this;
    }

    public EmployeeBuilder gender(String gender) {
        this.employee.setGender(gender);
        return this;
    }

    public EmployeeBuilder salary(int salary) {
        this.employee.setSalary(salary);
        return this;
    }

    public EmployeeBuilder client(String client) {
        if (this.clients == null){
            this.clients = new ArrayList<>();
            this.employee.setClients(this.clients);
        }
        this.clients.add(client);
        return this;
    }

    public Employee build() {
        return this.employee;
    }
}
