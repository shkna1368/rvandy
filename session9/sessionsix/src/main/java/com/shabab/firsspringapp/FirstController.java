package com.shabab.firsspringapp;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class FirstController {

    @GetMapping("/hi")
    public String sayHi(){

        return "hi";
    }

      @GetMapping("/hi2/{id}")

    public String sayHi2(@PathVariable Long id){

        return "hi2"+id;
    }
@GetMapping("/hi2/{id}/{nationalCode}")

    public String sayHi3(@PathVariable("id") Long id,@PathVariable("nationalCode") String  nationalCode){

        return "hi-"+id+"-"+nationalCode;
    }



    @GetMapping("/hi4")

    public String sayHi4(@RequestParam (name = "id",required = false) Long id,@RequestParam ("nationalCode") String  nationalCode){

        return "hi4-"+id+"-"+nationalCode;
    }


    @PostMapping("/hi5")

    public String sayHi4(@RequestBody Map<String,Object> data){


        StringBuilder stringBuilder=new StringBuilder();

        for (Map.Entry<String, Object> entry : data.entrySet()) {
            stringBuilder.append(entry.getKey() + ":" + entry.getValue());
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        return stringBuilder.toString();
    }

 @PostMapping("/hi6")

    public String sayHi4(@RequestBody Student student){


        return student.toString();
    }
@PostMapping("/hi7/{version}")

    public String sayHi7(@RequestBody Student student,@PathVariable Integer version){


        return student.toString()+"-"+version;
    }


    @PutMapping("/hi6")

    public String sayHi9(@RequestBody Student student){


        return student.toString();
    }


}
