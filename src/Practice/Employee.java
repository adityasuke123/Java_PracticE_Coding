package Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee {

    String name;
    int age;
    double salary;
    String dept;

    public Employee(String name, int age, double salary, String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public String getDept() {
        return dept;
    }

    public String toString() {
        return name+":"+age+":"+salary+":"+dept;
    }
    public static void main(String [] args) {
        List<Employee> list = Arrays.
                asList(new Employee ("aditya",15,1900,"mech"),
                       new Employee("rohan",35, 2000,"it"),
                        new Employee("manish",78,2700,"it"),
                       new Employee("chetan",28,1900, "mech"),
                        new Employee("bhushan",45,230, "cse"));
//...................group emp by dept.............................................
//        Map<String, List<Employee>> map  = list.stream().
//                collect(Collectors.groupingBy(Employee::getDept));
//        System.out.println(map);

//...................count emp by dept...............................................
//        Map<String, Long> list2 = list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
//        System.out.println(list2);

//....................max salary from each dept........................................
//        Map<String, Optional<Employee>> map2 = list.stream().collect(Collectors.groupingBy(Employee::getDept,
//                Collectors.minBy(Comparator.comparing(Employee :: getSalary))));
//
//        System.out.println(map2);

//....................avg salary from each dept.........................................
//        Map<String, Double> map3 = list.stream().collect(Collectors.groupingBy(Employee::getDept,
//                Collectors.averagingDouble(Employee :: getSalary)));
//        System.out.println(map3);

//.....................sum salary from each dept.........................................
//        Map<String, Double> map4 = list.stream().collect(Collectors.groupingBy(Employee::getDept,
//                Collectors.summingDouble(Employee :: getSalary)));
//
//        System.out.println(map4);

//.....................total salary of all emp............................................
//        Double total = list.stream().collect(Collectors.summingDouble(Employee :: getSalary));
//        System.out.println(total);

//......................avg salary of all emp..............................................
//        Double avg = list.stream().collect(Collectors.averagingDouble(Employee :: getSalary));
//        System.out.println(avg);

//.......................max salary from all dept..........................................
//        Optional max = list.stream().collect(Collectors.minBy(Comparator.comparing(Employee :: getSalary)));
//        System.out.println(max);

//.......................duplicate salary from ALL dept.....................................
//        list.stream().collect(Collectors.groupingBy(Employee :: getSalary, Collectors.counting()))
//                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey)
//                .forEach(System.out::println);



    }
}
