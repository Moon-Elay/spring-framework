package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

  /*  @RequestMapping("/info") //localhos:8080/car/info?make=Honda
    public String  carInfo(@RequestParam String make, @RequestParam Integer year, Model model){

model.addAttribute("make", make);
model.addAttribute("year", year);

        return  "car/car-info";
    }


   */
    @RequestMapping("/info") //localhos:8080/car/info?make=Honda
    public String  carInfo2(@RequestParam(value= "make", required = false) String make, Model model){

        model.addAttribute("make", make);

        return  "car/car-info";
    }

}
