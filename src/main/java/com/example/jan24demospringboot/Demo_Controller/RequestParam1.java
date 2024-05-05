package com.example.jan24demospringboot.Demo_Controller;
import com.example.jan24demospringboot.modal.Employee;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RequestParam1 {



// calculator by path variable
@RequestMapping("/calc2/{a}/{b}")
public String Calc(@PathVariable int a , @PathVariable int b) {


    return "Addition of given nums is " + (a + b) + "\n" +
            "Multi of given nums is" + (a * b) + "\n" +
            "division of given num is " + a / b + "\n" +
            "sub of given nums is " + (a - b) + "\n";
}

    // calculator by Request param
    @RequestMapping("/cal3")
    public String cal3(@RequestParam int a, @RequestParam int b) {

        return "Addition of given nums is " + (a + b) + "\n" +
                "Multi of given nums is" + (a * b) + "\n" +
                "division of given num is " + ((double) a / b) + "\n" +
                "sub of given nums is " + (a - b) + "\n";
    }

   // return Employee PathVariable and Requestparam
    @RequestMapping(value = "/employee/{name}/{age}/{salary}")
    public Employee getemp(@PathVariable String name, @PathVariable int age, @PathVariable double salary) {

        Employee employee = new Employee(name, age, salary);
        return employee;
    }

    @RequestMapping(value = "/employee1")
    public Employee getemp1(@RequestParam String name, @RequestParam int age,@RequestParam double salary) {

        Employee employee = new Employee(name, age, salary);
        return employee;
    }


}
