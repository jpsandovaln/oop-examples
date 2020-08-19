package builder;

import java.util.List;

/**
 * @author HP
 * @version 1.1
 */
public class Employee {
    private int id;
    private int ci;
    private String firstName;
    private String lastName;
    private int age;
    private int phone;
    private String gender;
    private int salary;
    private List<String> clients;

    public Employee(int id, int ci, String firstName, String lastName) {
        this.id = id;
        this.ci = ci;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(int id, int ci, String firstName, String lastName, List<String> clients) {
        this.id = id;
        this.ci = ci;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clients = clients;
    }

    public Employee(int id, int ci, String firstName, String lastName, int age) {
        this.id = id;
        this.ci = ci;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Employee(int id, int ci, String firstName, String lastName, int age, int phone) {
        this.id = id;
        this.ci = ci;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
    }

    public Employee(int id, int ci, String firstName, String lastName, int age, int phone, String gender) {
        this.id = id;
        this.ci = ci;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
    }

    public Employee(int id, int ci, String firstName, String lastName, int age, int phone, String gender, int salary) {
        this.id = id;
        this.ci = ci;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee(int id, int ci, String firstName, String lastName, int age, int phone, String gender, int salary, List<String> clients) {
        this.id = id;
        this.ci = ci;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.salary = salary;
        this.clients = clients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<String> getClients() {
        return clients;
    }

    public void setClients(List<String> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", ci=" + ci +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", clients=" + clients +
                '}';
    }
}
