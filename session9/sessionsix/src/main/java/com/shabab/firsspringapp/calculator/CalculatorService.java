package com.shabab.firsspringapp.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService{
    @Override
    public Integer sum(Integer num1, Integer num2) {
        return num1+num2;
    }



    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1-num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1*num2;

    }
}
