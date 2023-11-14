package com.example27.SpringEmployeeBook;

import java.util.Collection;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName);
    Employee removeEmployee(String firstName, String lastName);
    Employee searchEmployee(String firstName, String lastName) ;
    Collection<Employee> showAllEmployeeList();
}
