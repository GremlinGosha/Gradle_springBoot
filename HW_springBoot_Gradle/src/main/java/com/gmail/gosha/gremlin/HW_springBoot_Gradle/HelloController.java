package com.gmail.gosha.gremlin.HW_springBoot_Gradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //just comment for test
    @GetMapping("/")

    public String index() {
        return "Greeting from Spring Boot!";
    }
}
