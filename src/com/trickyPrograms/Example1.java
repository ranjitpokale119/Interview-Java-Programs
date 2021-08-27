package com.trickyPrograms;

import com.CommonClasses.Employee;

import java.util.Arrays;
import java.util.List;

//1) Can you instantiate this class?
public class Example1 {
    Example1 example1 = new Example1();

    public static void main(String[] args) {
        System.out.println("args = " + args);

        List<Employee> employeeList = Arrays.asList(new Employee(1, "Satish"),
                new Employee(2, "Abhi"),
                new Employee(3, "Prashant"));

    }
}
