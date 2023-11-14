package com.example27.SpringEmployeeBook;

import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class EmployeeServiceImpl implements EmployeeService {
    private Map<String , String> employeeList;
    public EmployeeServiceImpl(){this.employeeList= new HashMap <>();}

    @Override
    public Employee addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.containsKey(employee)) {
            throw new EmployeeAlreadyAddedException("уже есть такой сотрудник");
        }
        employeeList.put(firstName, lastName);
        return employee;
    }
    @Override
    public Employee removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee( firstName, lastName);
        if (employeeList.containsKey(employee)) {
            employeeList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException("Такого сотрудника нет в списке");
    }

    @Override
    public Employee searchEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if (employeeList.containsKey(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException("Такого сотрудника нет в списке");
    }

    @Override
    public Map<String, String> showAllEmployeeList() {

        return employeeList;
    }
    }


