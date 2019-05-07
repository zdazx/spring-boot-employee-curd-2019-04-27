package com.spring.boot.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path = "employees",method = RequestMethod.GET)
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @RequestMapping(path = "employee/add",method = RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @RequestMapping(path = "employee/addMore",method = RequestMethod.POST)
    public void addMoreEmployee(@RequestBody List<Employee> employeeList){
        employeeService.addMoreEmployee(employeeList);
    }

    @RequestMapping(path = "employee", method = RequestMethod.GET)
    public Employee getEmployeeByName(@PathParam("name") String name){
        return employeeService.getEmployeeByName(name);
    }

    @RequestMapping(path = "employee/delete", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathParam("name") String name){
        employeeService.deleteEmployee(name);
    }

    @RequestMapping(path = "employee/update", method = RequestMethod.PUT)
    public void updateEmployee(@PathParam("name") String name, @PathParam("updateAge") int updateAge){
        employeeService.updateEmployee(name,updateAge);
    }
}
