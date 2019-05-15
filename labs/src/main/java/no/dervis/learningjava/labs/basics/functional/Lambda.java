package no.dervis.learningjava.labs.basics.functional;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {

    class Employee {
        private int salary;
        public Employee(int salary) { this.salary = salary; }
        public String toString() { return "Employee{ salary=" + salary + '}'; }
    }

    // lambda with a closure
    private Predicate<Employee> paidMore(int amount) {
        return employee -> employee.salary > amount;
    }

    // lambda with a closure
    private List<Employee> highPaidLambdaClosure(List<Employee> emps) {
        int threshold = 150;

        return emps.stream()
                .filter(e -> e.salary > threshold)
                .collect(Collectors.toList());
    }

    // only lambda
    private List<Employee> highPaidLambda(List<Employee> emps) {
        return emps.stream()
                .filter(e -> e.salary > 150)
                .collect(Collectors.toList());
    }

    private void testLambdas() {

        Employee employeeHighPaid = new Employee(200);
        Employee employeeLowPaid = new Employee(100);

        Predicate<Employee> isPaidHigh = paidMore(150);

        System.out.println("Is paid high: " + isPaidHigh.test(employeeHighPaid));
        System.out.println("Is paid high: " + isPaidHigh.test(employeeLowPaid));

        System.out.println(highPaidLambdaClosure(List.of(employeeHighPaid, employeeLowPaid)));
        System.out.println(highPaidLambda(List.of(employeeHighPaid, employeeLowPaid)));

    }


    public static void main(String[] args) {
        new Lambda().testLambdas();
    }

}
