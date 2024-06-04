package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController
public class Price {
    HashMap<String,Integer> ClothPrice=new HashMap<>();
    @RequestMapping("/AddClothePrice/{ClotheName}/{Price}")
    public String AddClothePrice(@PathVariable String ClotheName, @PathVariable int Price){
        ClothPrice.put(ClotheName,Price);
        return "Details of "+ClotheName+" is Added Successfully...";
    }
    @RequestMapping("/GetClothe")
    public HashMap<String,Integer> GetClothe(){
        return ClothPrice;
    }
    @RequestMapping("/UpdateClothePrice/{ClotheName}/{oldPrice}/{newPrice}")
    public String UpdateClothe(@PathVariable String ClotheName,@PathVariable int oldPrice,@PathVariable int newPrice){
        ClothPrice.replace(ClotheName,oldPrice,newPrice);
        return ClotheName+"'S Details Updated Successfully....";
    }
    @RequestMapping("/RemoveClothe/{ClotheName}")
    public String RemoveClothe(@PathVariable String ClotheName){
        ClothPrice.remove(ClotheName);
        return "Marks Removed Successfully";
    }
}
