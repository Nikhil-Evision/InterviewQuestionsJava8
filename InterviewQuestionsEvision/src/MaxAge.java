import java.util.Arrays;
import java.util.List;

public class MaxAge {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25),
                new Employee("Bob", 30),
                new Employee("Charlie", 35)
        );
        int maxAge = employees.stream().mapToInt(Employee::getAge).max().orElse(0);
        System.out.println(maxAge);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
