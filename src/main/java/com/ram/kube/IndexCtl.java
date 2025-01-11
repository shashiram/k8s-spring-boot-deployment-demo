package com.ram.kube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexCtl {

    @GetMapping("/hello")
    public String hello(){
        return "hi";
    }
}
