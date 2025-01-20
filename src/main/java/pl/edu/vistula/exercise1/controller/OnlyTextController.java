package pl.edu.vistula.exercise1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OnlyTextController {
    @GetMapping(value = "/")
    public String hello() { return "Hello Vistula, in my first Spring controller."; }
    //localhost:8080/
}
