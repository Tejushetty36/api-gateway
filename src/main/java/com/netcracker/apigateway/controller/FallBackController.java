package com.netcracker.hystrixdashboard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallBackController {

    @RequestMapping("/employeeFallBack")
    public Mono<String> employeeServiceFallBack(){
        return Mono.just("Employee Service is taking too long to respond or is down.Please try after sometime.");
    }

    @RequestMapping("/departmentFallBack")
    public Mono<String> departmentServiceFallBack(){
        return Mono.just("Department Service is taking too long to respond or is down.Please try after sometime.");
    }
}
