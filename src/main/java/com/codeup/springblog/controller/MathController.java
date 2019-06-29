package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}/")
    @ResponseBody
    public String sumTwoNums(@PathVariable double num1, @PathVariable double num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @GetMapping("/subtract/{num2}/from/{num1}/")
    @ResponseBody
    public String subtractTheNums(@PathVariable double num1, @PathVariable double num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @GetMapping("/multiply/{num1}/and/{num2}/")
    @ResponseBody
    public String multiplyTheseNums(@PathVariable double num1, @PathVariable double num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @GetMapping("/divide/{num1}/and/{num2}/") //had to declare primitives as doubles to allow for accurate division (i.e. 6/5 = 1.2, not 1, as it would be with "int")
    @ResponseBody
    public String divideTheNums(@PathVariable double num1, @PathVariable double num2) {
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

}
