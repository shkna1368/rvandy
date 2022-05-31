package com.shabab.firsspringapp;


import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hi")
    public String sayHi(){

        return "hi";
    }

      @GetMapping("/hi2")

    public String sayHi2(){

        return "hi2";
    }


}
