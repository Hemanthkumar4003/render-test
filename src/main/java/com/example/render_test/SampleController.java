package com.example.render_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/renderTest")
public class SampleController {

    @GetMapping(value = "/test")
    public String test() {
        return "Render Test Successfully Running..............";
    }

    @GetMapping(value = "/test2")
    public String test2() {
        return "Render Test V2 Successfully Running..............";
    }
}
