package com.springproject.demo.api;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping ( value = "/hello")
    public String helloWorld() {
        return "Hello World!";
    }
}
