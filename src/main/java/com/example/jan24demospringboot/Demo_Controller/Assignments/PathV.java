package com.example.jan24demospringboot.Demo_Controller.Assignments;
import com.example.jan24demospringboot.modal.Employee;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;




@RestController
public class PathV {
    /* 3- return Employee List PathVariable and Requestparam*/


    private List<Employee> employees = new ArrayList<>();
    // Constructor to initialize some employees
    public PathV () {
        employees.add(new Employee("raj", 30, 50000));
        employees.add(new Employee("Abhi", 25, 60000));
        employees.add(new Employee("Babu", 35, 70000));
    }
    @RequestMapping("/employees55/{names}")
    public List<Employee> getEmployeesByNames(@PathVariable List<String> name) {
        List<Employee> selectedEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (name.contains(employee.getName())) {
                selectedEmployees.add(employee);
            }
        }
        return selectedEmployees;
    }

    // Armstrong number with PathVariable

    @RequestMapping("/arms/{n}")
    public String arms(@PathVariable int n) {
        int rem, sum = 0;
        int c = n;
        while (n > 0) {
            rem = n % 10;
            sum = rem * rem * rem +(sum);
            n = n / 10;
        }
        if (sum == c)
            return " num is arm " + c;
        else
            return "num is not arm " + c;


    }

   // Palendrom number with PathVariable
    @RequestMapping("/pal/{n}")
    public String pal(@PathVariable int n) {
        int rem, c, s = 0;
        c = n;
        while (n > 0) {
            rem = n % 10;
            s = (s * 10) + rem; // Reverse the number
            n = n / 10;
        }
        if (c == s)
            return "Number is a palindrome: " + c;
        else
            return "Number is not a palindrome: " + c;
    }


}
