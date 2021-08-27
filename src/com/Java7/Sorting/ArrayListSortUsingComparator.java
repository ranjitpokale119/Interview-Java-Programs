package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortUsingComparator {

    public static void main(String a[]) {

        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Ram", 3000));
        list.add(new Employee("John", 6000));
        list.add(new Employee("Crish", 2000));
        list.add(new Employee("Tom", 2400));

        /*-----------------------------------------------------------------------*
        Collections.sort(list, new MySalaryComp());
        //Collections.sort(list, (e1,e2) -> e1.getSalary()< e2.getSalary());
        System.out.println("Sorted list entries using Salary:MySalaryComp: ");
        for (Empl e : list) {
            System.out.println(e);
        }
        System.out.println("EmployeeNameComp ");

        /*-----------------------------------------------------------------------*/
        //Collections.sort(list, new EmployeeNameComp());
        //Using Java 8
        Collections.sort(list, Comparator.comparing(Employee::getName));
        list.forEach(System.out::println);
        System.out.println("Sorted list entries using Comparator.comparing: ");
        Collections.sort(list, (e1, e2) -> e1.getName().compareTo(e2.getName()));

        System.out.println("Sorted list entries using Name:EmployeeNameComp: ");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}

class MySalaryComp implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getSalary() > e2.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class EmployeeNameComp implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e1.getName());
    }
}

//---------------POJO-------------------------------
class Employee {

    private String name;
    private int salary;

    public Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Empl [name=" + name + ", salary=" + salary + "]";
    }

}