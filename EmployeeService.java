package Hw4_ContactList;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    List<Employee> employeeList = new ArrayList<>();

    public List<Employee> addInList(Employee employee) {
        employeeList.add(employee);
        return employeeList;
    }

    public Employee searchTabel(Integer tabelNumber) {
        for (Employee e : employeeList) {
            if (e.getTabelNumber().equals(tabelNumber)) {
                System.out.println(e);
                return e;
            }
        }
        System.out.println("Сотрудник не найден.");
        return null;
    }


    public Employee searchName(String name) {
        for (Employee e : employeeList) {
            if (e.getName().equals(name)) {
                System.out.println(e.getPhoneNumber());
                return e;
            }
        }
        System.out.println("Сотрудник не найден.");
        return null;
    }


    public Employee searchExperience(Integer experience) {
        for (Employee e : employeeList) {
            if (e.getExperience().equals(experience)) {
                System.out.println(e);
                return e;
            }
        }
        System.out.println("Сотрудник не найден.");
        return null;
    }
}
