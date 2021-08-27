package com.Java8.stream.filter;

import com.CommonClasses.Employee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        System.out.println("\n=== printAllEmployeeNamesStartingWithA ====");
        printAllEmployeeNamesStartingWithA(employeeList);

        sortMapValuesInDecesednginOrder(Employee.getAllEmployeeMap());

    }

    private static void sortMapValuesInDecesednginOrder(Map<Integer, Employee> allEmployeeMap) {

    }

    private static void printMapOfEmployeeByTheirGender(List<Employee> employeeList) {
        Map<Character, List<Employee>> map =
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getGender));
        System.out.println("map = " + map);
    }

    private static void printAllEmployeeWhoseSalGreterThanGiven(List<Employee> employeeList, long l) {
        employeeList = employeeList.stream().filter(e -> e.getSalary() > l).collect(Collectors.toList());
        employeeList.forEach(System.out::println);
    }

    private static void printAllEmployeeNames(List<Employee> employeeList) {
        List<String> eNames = employeeList.stream().map(e -> e.getName()).collect(Collectors.toList());
        eNames.forEach(System.out::println);
    }

    private static void printAllEmployeeNamesStartingWithA(List<Employee> employeeList) {
        List<Employee> eNames = employeeList.stream().filter(e -> e.getName().startsWith("A")).collect(Collectors.toList());
        eNames.forEach(System.out::println);
    }
}
