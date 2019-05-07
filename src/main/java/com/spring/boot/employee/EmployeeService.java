package com.spring.boot.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getEmployees(){
        return employeeDao.getEmployees();
    }

    public void addEmployee(Employee employee){
        employeeDao.addEmployee(employee);
    }

    public Employee getEmployeeByName(String name){
        return employeeDao.getEmployeeByName(name);
    }

    public void deleteEmployee(String name){
        employeeDao.deleteEmployee(name);
    }

    public void addMoreEmployee(List<Employee> employeeList){
        employeeDao.addMoreEmployee(employeeList);
    }

    public void updateEmployee(String name, int updateAge){
        employeeDao.updateEmployee(name,updateAge);
    }
}
