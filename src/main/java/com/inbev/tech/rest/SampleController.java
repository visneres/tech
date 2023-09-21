package com.inbev.tech.rest;

import com.inbev.tech.exceptions.CustomNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.ServiceUnavailableException;

@RestController
@RequestMapping("/api")
public class SampleController{

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        if ("error".equals(name)){
            throw new CustomNotFoundException("User error..");
        }
        return "Hello, " + name + "!";
    }

    @GetMapping("/generic")
    public String generic() throws Exception{
        throw new Exception("Generic Error");
    }

    @GetMapping("/serviceUnavailable")
    public String serviceUnavailable() throws Exception{
        throw new ServiceUnavailableException("Serviço fora do ar!");
    }
}