package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class InterpreterController {

    @GetMapping("/interpreter")
    public String testInterpreter(){

        //тут вызвать логику

        return "Interpreter GET!";
    }

    @PostMapping("/interpreter")
    public String testInterpreter(@RequestBody String body){

        //тут вызвать логику

        return "Interpreter POST!";
    }
}
