package tech.meliora.academy.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class GreetingController {
    @GetMapping("/greeting")
    public String greet() {
        return "Hello from Sample Client";
    }
}
