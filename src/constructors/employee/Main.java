package constructors.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);

        Employee employee1 = new Employee("John", 1000);
        System.out.println(employee1);

        Employee employee2 = new Employee("Lola", 1000, "Poland");
        System.out.println(employee2);
    }
}

