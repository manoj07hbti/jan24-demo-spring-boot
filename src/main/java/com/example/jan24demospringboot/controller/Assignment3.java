package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assignment3 {


    @RequestMapping("/add_rp")
    public String add(@RequestParam int num1, @RequestParam int num2){
        return  num1+num2 + " addition of given numbers" ;
    }

    @RequestMapping("/sub_rp")
    public String sub(@RequestParam int num1, @RequestParam int num2){

        return  num1-num2 + " subtraction of given numbers" ;
    }

    @RequestMapping("/multi_rp")
    public String multi(@RequestParam int num1, @RequestParam int num2){

        return  num1*num2 + " multiplication of given numbers" ;
    }

    @RequestMapping("/div_rp")
    public String div(@RequestParam int num1, @RequestParam int num2){

        return  num1/num2 + " division of given numbers" ;
    }

    // pathvariable armstrong example
    @RequestMapping("/armstrong_pv/{num}")
    public String armstrongPV(@PathVariable int num){
        int num1= num;
        int num2 = num;
        int sum= 0;
        int count =0;
        while(num1!=0){
            count ++;
            num1/=10 ;
        }
        while(num2!=0)
        {
            int rem = num2%10 ;
            int b=1;
            for (int i=1; i<=count; i++){
                b = b*rem ;
            }
            sum = sum+b ;
            num2/=10 ;
        }
        return (num==sum?"Armstrong":"Not Armstrong;") ;
    }
// Rquestparam armstrong
    @RequestMapping("/armstrong_rp")
    public String armstrongRP(@RequestParam int num){
        int num1= num;
        int num2 = num;
        int sum= 0;
        int count =0;
        while(num1!=0){
            count ++;
            num1/=10 ;
        }
        while(num2!=0)
        {
            int rem = num2%10 ;
            int b=1;
            for (int i=1; i<=count; i++){
                b = b*rem ;
            }
            sum = sum+b ;
            num2/=10 ;
        }
        return (num==sum?"Armstrong":"Not Armstrong;") ;
    }

    // palindrome program with pathvaraible
    @RequestMapping("/palindrome_pv/{num}")
    public String palindromePV(@PathVariable int num){
        int temp =  num ;
        int rev=0;
        while (num!=0){
            int rem=num%10;
            rev = rev*10+rem;
            num/=10;
        }
        return (temp==rev?"Palindrome":"not palindrome ");
    }

    //palindrome program with requestparam
    @RequestMapping("/palindrome_rp")
    public String palindromeRP(@RequestParam int num){
        int temp = num;
        int rev=0;
        while(temp!=0){
            int rem= temp%10;
            rev= rev*10+rem;
            temp/=10;
        }
        return (num==rev?"Palindrome number":"not a palindrome number") ;
    }
}
