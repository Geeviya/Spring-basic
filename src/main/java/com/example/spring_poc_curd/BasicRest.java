package com.example.spring_poc_curd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BasicRest {

    public String []Name ={"GV","DAKI","KOUSHI","ENI","GOWSI"};
   @GetMapping("/get")
     public String [] get()
    {
        return Name;
    }
}
