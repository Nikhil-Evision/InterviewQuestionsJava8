package lambdaexamples;
import java.util.Arrays;
import java.util.List;

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



public class MaxAgeEmployee {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John", 25),
                new Employee("Jane", 30),
                new Employee("Bob", 28)
        );

        int maxAge = employees.stream()
                .mapToInt(Employee -> Employee.getAge())
                .max()
                .orElse(0);
        System.out.println(maxAge);

    }
}
