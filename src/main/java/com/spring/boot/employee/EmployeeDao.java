package com.spring.boot.employee;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDao {
    private static List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees(){
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Employee getEmployeeByName(String name){
        return employees.stream().filter(e -> e.getName().equals(name)).findFirst().orElse(null);
    }

    public void deleteEmployee(String name){
        Employee employee = employees.stream().filter(e -> e.getName().equals(name)).findFirst().orElse(null);
        employees.remove(employee);
    }

    public void addMoreEmployee(List<Employee> employeeList){
        employees.addAll(employeeList);
    }

    public void updateEmployee(String name, int updateAge){
        Employee employee = employees.stream().filter(e -> e.getName().equals(name)).findFirst().orElse(null);
        int index = employees.indexOf(employee);
        employee.setAge(updateAge);
        employees.set(index,employee);
    }
}
