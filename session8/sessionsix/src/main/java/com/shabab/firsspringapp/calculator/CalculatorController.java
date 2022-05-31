package com.shabab.firsspringapp.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

 /*  field injection
  @Autowired
    ICalculatorService calculatorService;*/


  private   ICalculatorService calculatorService;



  /*  public CalculatorController(ICalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }*/

    @GetMapping("/sum/{num1}/{num2}")
    public Integer sum(@PathVariable("num1") Integer num1,@PathVariable("num2") Integer num2){
        return  calculatorService.sum(num1,num2);

    }

    @GetMapping("/minus/{num1}/{num2}")
    public Integer minus(@PathVariable("num1") Integer num1,@PathVariable("num2") Integer num2){
        return  calculatorService.minus(num1,num2);
    }

   @Autowired
    public void setCalculatorService(ICalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
}
