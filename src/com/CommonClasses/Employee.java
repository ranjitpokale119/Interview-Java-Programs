package com.CommonClasses;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private Integer id;
    private String name;
    private double salary;
    private Department department;
    private List<Address> addresses;
    private char gender;

    public Employee(Integer id, String name, double salary, char gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public static List<Employee> getAllEmployees() {
        return Arrays.asList(
                new Employee(1, "Jay", 40000, 'M'),
                new Employee(2, "Aakash", 50000, 'M'),
                new Employee(3, "aarav", 57000, 'M'),
                new Employee(4, "Vaishnavi", 70000, 'F'),
                new Employee(5, "Sakshi", 80000, 'F'),
                new Employee(6, "Rohan", 30000, 'M')
        );
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", addresses=" + addresses +
                ", gender=" + gender +
                '}';
    }
}
