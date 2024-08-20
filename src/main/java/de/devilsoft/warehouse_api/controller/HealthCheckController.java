package de.devilsoft.warehouse_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HealthCheckController {
    
    @GetMapping(path = "/health")
    public String healthCheck() {
        return "Hello World!";
    }
    
}
