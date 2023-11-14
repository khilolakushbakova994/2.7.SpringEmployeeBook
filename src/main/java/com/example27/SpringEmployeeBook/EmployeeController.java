package com.example27.SpringEmployeeBook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final com.example27.SpringEmployeeBook.EmployeeServiceImpl employeeService;

    public EmployeeController(com.example27.SpringEmployeeBook.EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;

    }
    @GetMapping("/add")
    public com.example27.SpringEmployeeBook.Employee addEmployee (@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping("/remove")
    public com.example27.SpringEmployeeBook.Employee removeEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return employeeService.removeEmployee(firstName,lastName);
    }

    @GetMapping("/find")
    public com.example27.SpringEmployeeBook.Employee searchEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return employeeService.searchEmployee(firstName,lastName);

    }
    @GetMapping
    public Map<String, String> showAllEmployeeList () {
        return employeeService.showAllEmployeeList();
    }

}


