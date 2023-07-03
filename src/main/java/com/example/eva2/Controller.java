package com.example.eva2;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/idat")
public class Controller{

    @GetMapping(path="/idat/codigo")
    public String code(){
        return "SL74888507";
    }
    @GetMapping(path="/idat/nombrecompleto")
    public String name(){
        return "SL74888507";
    }

}