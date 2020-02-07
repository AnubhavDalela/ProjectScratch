package PredicatesLamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamples {

    public static void main(String[] args) {

        Predicate<Employee> stringPredicate = (employee) -> employee.getName().startsWith("Raj");

        Predicate<Employee> employeeNamePredicate = (employee) -> employee.getName().equals("Rajnikant");

        Predicate<Employee> employeeAgePredicate = (employee) -> employee.getAge() > 35;

        Employee employee = new Employee(100, "Rajnikant", 38, "Software Engineer");
        Employee employee1 = new Employee(101, "Rajnikant", 19, "Senior Software Engineer");
        Employee employee2 = new Employee(102, "Vikas", 23, "Software Engineer");
        Employee employee3 = new Employee(103, "Anubhav", 48, "Software Engineer");
        Employee employee4 = new Employee(104, "Sreeni", 45, "Software Engineer");
        List<Employee> employeeList = Arrays.asList(employee, employee1, employee2, employee3, employee4);

        employeeList.stream()
                .filter(stringPredicate)
                .forEach(System.out::println);

//        for (Employee employee123 : employeeList){
//            if(employee123.getName().startsWith("Raj")){
//                System.out.println();

    }
}
