package com.staroot.h2example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String,String> Hello(){
        Map<String,String> map1 = new HashMap<String,String>();
        map1.put("hello","world");

        return map1;
    }
    
}
