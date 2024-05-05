package com.example.jan24demospringboot.Demo_Controller.Assignments;
import org.springframework.web.bind.annotation.*;
import com.example.jan24demospringboot.modal.Employee;
import java.util.ArrayList;
import java.util.List;
@RestController
public class RequestP {
    /* 3- return Employee List PathVariable and Requestparam*/


    public ArrayList<Employee> employees = new ArrayList<>();

    // Constructor to initialize some employees
    public RequestP() {
        employees.add(new Employee("raj", 30, 50000));
        employees.add(new Employee("Abhi", 25, 60000));
        employees.add(new Employee("Babu", 35, 70000));
        employees.add(new Employee("Rahul",25,562652));
    }

    @RequestMapping("/employees57")
    public ArrayList<Employee> getEmployeesByNames(@RequestParam ArrayList<String> name) {
        ArrayList<Employee> selectedEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (name.contains(employee.getName())) {
                selectedEmployees.add(employee);
            }
        }
        return selectedEmployees;
    }

    // Armstrong number with Requestparam

    @RequestMapping("/arms")
    public String arms(@RequestParam int n) {
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

    // Palendrom number with Requestparam
    @RequestMapping("/pal2")
    public String pal(@RequestParam int n) {
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
