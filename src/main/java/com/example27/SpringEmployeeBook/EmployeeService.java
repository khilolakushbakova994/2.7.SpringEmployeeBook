package com.example27.SpringEmployeeBook;

import java.util.Map;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName);
    Employee removeEmployee(String firstName, String lastName);
    Employee searchEmployee(String firstName, String lastName) ;
    Map<String, String> showAllEmployeeList();
}
