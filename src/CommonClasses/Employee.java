package CommonClasses;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String address;
    private char gender;

    public Employee(int id, String name, double salary, String address, char gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.gender = gender;
    }

    public static List<Employee> getAllEmployees() {
        return Arrays.asList(
                new Employee(1, "Jay", 40000, "Mumbai", 'M'),
                new Employee(1, "Aakash", 50000, "Pune", 'M'),
                new Employee(1, "Vaishnavi", 70000, "Jaipur", 'F'),
                new Employee(1, "Sakshi", 80000, "Delhi", 'F'),
                new Employee(1, "Rohan", 30000, "Noida", 'M')
        );
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
