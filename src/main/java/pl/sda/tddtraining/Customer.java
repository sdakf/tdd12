package pl.sda.tddtraining;

public class Customer {
    private final String name;
    private final String lastName;
    private final Integer age;
    private final Integer salary;
    private final Integer id;
    private static int count = 1;

    public Customer(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.id = count++;
    }

    public Customer(String name, String lastName, int age, String salary) {
        this(name, lastName, age, Integer.valueOf(salary));
    }
}
