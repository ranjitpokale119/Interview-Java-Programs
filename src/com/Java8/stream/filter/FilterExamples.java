package com.Java8.stream.filter;

import com.CommonClasses.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExamples {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
        List<Employee> employeeList = Employee.getAllEmployees();

        System.out.println("\n=== printAllEmployees ====");
        employeeList.forEach(emp -> System.out.println(emp));

        System.out.println("\n=== printAllEmployeeNames ====");
        printAllEmployeeNames(employeeList);
        System.out.println("\n=== printAllEmployeeWhoseSalGreterThanGiven ====");
        printAllEmployeeWhoseSalGreterThanGiven(employeeList, 40000l);
        System.out.println("\n=== printMapOfEmployeeByTheirGender ====");
        printMapOfEmployeeByTheirGender(employeeList);


    }

    private static void printMapOfEmployeeByTheirGender(List<Employee> employeeList) {
        /*List<String> employeeNames = employeeList.stream().map(e -> e.getName()).collect(Collectors.toList());
        Map<String,List<Employee>> map= new HashMap<>();
        map=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Employee::getName));

        employeeNames.forEach(System.out::println);*/
    }

    private static void printAllEmployeeWhoseSalGreterThanGiven(List<Employee> employeeList, long l) {
        employeeList = employeeList.stream().filter(e -> e.getSalary() > l).collect(Collectors.toList());
        employeeList.forEach(System.out::println);
    }

    private static void printAllEmployeeNames(List<Employee> employeeList) {
        List<String> eNames = employeeList.stream().map(e -> e.getName()).collect(Collectors.toList());
        eNames.forEach(System.out::println);
    }
}
