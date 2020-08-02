package stream;

import java.util.List;

/**
 * @author HP
 * @version 1.1
 */
public class School {
    private String name;
    private int year;
    private List<Student> studentList;

    public School(String name, int year, List<Student> studentList) {
        this.name = name;
        this.year = year;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", studentList=" + studentList +
                '}';
    }
}
