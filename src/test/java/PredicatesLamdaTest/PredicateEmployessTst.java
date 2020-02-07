package PredicatesLamdaTest;

import PredicatesLamda.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEmployessTst {

    public static void main(String[] args) {

        Predicate<Employees> stringPredicate = (Employees) ->  Employees.getName().contains("ohi");
        Predicate<Employees> namePredicate = (employee) -> employee.getName().equals("Rohit");
        Predicate<Employees> agePredecate = (employee) -> employee.getAge() > 25;

        Employees emp1 = new Employees(12,"Rohit",25,"SER");
        Employees emp2 = new Employees(12,"Mohit",35,"QER");
        Employees emp3 = new Employees(12,"Kohit",45,"CER");
        Employees emp4 = new Employees(12,"Ramesh",22,"FER");
        Employees emp5 = new Employees(12,"Suresh",21,"PER");

        List<Employees> lst = Arrays.asList(emp1,emp2,emp3,emp4,emp5);

        lst.stream()
                .filter(namePredicate.or(agePredecate))
                .forEach(System.out::println);

    }

}
