import annotation.AnnotationReflexion;
import annotation.CustomMappingClass;
import annotation.CustomMappingMethodGet;
import annotation.CustomMappingMethodPost;
import generic.GenericValue;
import generic.ITestGeneric;
import generic.Validation;
import jdk.nashorn.internal.ir.CallNode;
import lambda.ICalculatorLambda;
import lambda.IStringPredicate;
import stream.School;
import stream.Student;
import stream.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author HP
 * @version 1.1
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        ICalculatorLambda sum = (a, b) -> { return a + b; };
        int sumResult = sum.calculate(5, 7);
        System.out.println(sumResult);

        //////////////////////////

        IStringPredicate<String> pred = value -> !value.isEmpty();
        boolean resultPre = pred.isValid("555");
        System.out.println(resultPre);

        Predicate<Integer> pred2 = data -> data > 21;
        boolean resultPre2 = pred2.test(555);
        System.out.println(resultPre2);

        /////////////////////////////////////

        Predicate<String> pred3 = (value) -> {
            if (value.equals("hi")) {
                return true;
             } else if (value.equals("hello")) {
                return false;
            } else {
                return true;
            }
        };

        boolean result3 = pred3.test("hello");
        System.out.println(result3);


        System.out.println("-----------------------");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Maria", "Perez", 28, "F", 5000));
        studentList.add(new Student("Jose", "Vargas", 25, "M", 6000));
        studentList.add(new Student("Carlos", "Paz", 30, "M", 7000));

        // select * from student;
        Consumer<Student> consumer = value -> System.out.println(value);

        studentList.stream().forEach(consumer);

        System.out.println("---------****-------------");
        // select lastName from student;
        Function<Student, String> function = student -> student.getLastName();
        studentList.stream()
                .map(function)
                .forEach(value -> System.out.println(value));

        System.out.println("-----------------------");
        // select name from student order by (name);
        studentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .map(student -> student.getName())
                .forEach(value -> System.out.println(value));

        System.out.println("----------123-------------");
         // select name, lastName from student age = 25;
         Predicate<Student> preStudent = student -> student.getAge() == 25;


         studentList.stream()
                .filter(preStudent)
                .map(student -> new Test(student.getName(), student.getLastName()))
                .forEach(value -> System.out.println(value));


        ///////////////////////////////////////////////////////////////
        System.out.println("*****************************************");

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("Maria", "Perez", 28, "F", 5000));
        studentList1.add(new Student("Jose", "Vargas", 25, "M", 6000));
        studentList1.add(new Student("Carlos", "Paz", 30, "M", 7000));

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("Lorena", "Arce", 28, "F", 4000));
        studentList2.add(new Student("Ana", "Mendez", 25, "F", 7000));
        studentList2.add(new Student("Ariel", "Cabrera", 30, "M", 8000));

        School school1 = new School("Avaroa", 2018, studentList1);
        School school2 = new School("Junin", 2019, studentList2);

        List<School> schoolList = new ArrayList<>();
        schoolList.add(school1);
        schoolList.add(school2);

        // Select * from school
        schoolList.stream()
                .forEach(value -> System.out.println(value));

        // select student.name, student.lastName
        // from student, school
        // where student.id and school.sid and school.name = "avaroa"

        // select name, lastName from student where schoolName = "avaroa"


        schoolList.stream()
                .filter(school -> school.getName().equals("Avaroa"))
                .map(school -> school.getStudentList())
                .flatMap(students -> students.stream())
                .map(student -> student.getName() + " - " + student.getLastName())
                .forEach(value -> System.out.println(value));

        testAnnotation();

    }

    public static void testAnnotation() {
        System.out.println("test annotation");

        String classMappingPath = "";
        String getMethodMappingPath = "";
        String postMethodMappingPath = "";

        Class<AnnotationReflexion> annClass = AnnotationReflexion.class;

        if(annClass.isAnnotationPresent(CustomMappingClass.class)) {
            Annotation annotation = annClass.getAnnotation(CustomMappingClass.class);
            CustomMappingClass customMappingClass = (CustomMappingClass) annotation;
            classMappingPath = customMappingClass.path();
        }
        System.out.println(classMappingPath);

        Method[] methods = annClass.getMethods();
        for(Method method : methods) {
            if (method.isAnnotationPresent(CustomMappingMethodGet.class)) {
                Annotation annotation = method.getAnnotation(CustomMappingMethodGet.class);
                CustomMappingMethodGet custom = (CustomMappingMethodGet)annotation;
                getMethodMappingPath = custom.getPath();
            }
            if (method.isAnnotationPresent(CustomMappingMethodPost.class)) {
                Annotation annotation = method.getAnnotation(CustomMappingMethodPost.class);
                CustomMappingMethodPost custom = (CustomMappingMethodPost)annotation;
                postMethodMappingPath = custom.postPath();
            }
        }

        System.out.println(classMappingPath + getMethodMappingPath);
        System.out.println(classMappingPath + postMethodMappingPath);
    }

    public static void loop() {
        List<Integer> test = new ArrayList<>();
        test.add(15);
        test.add(1);
        test.add(10);
        test.add(8);
        test.add(4);

        test.stream()
                .forEach(value -> System.out.println(value));

        for (int i=0; i< test.size(); i++){
            System.out.println(test.get(i));
        }

        System.out.println("-----------");

        for (Integer value : test) {
            System.out.println(value);
        }

        System.out.println("-----------");

        for (int i=0; i< test.size(); i++){
            if (test.get(i) < 10) {
                System.out.println(test.get(i));
            }

        }

        System.out.println("-----STREAM------");

        test.stream()
                .filter(value -> value < 10)
                .filter(value -> value % 2 == 0)
                .forEach(value -> System.out.println(value));
    }
}
