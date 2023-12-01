package com.apifox.demo.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudApi/test")
public class Test1CloudController {

    @GetMapping("/api1")
    public ApiVO api1() {
        return null;
    }

}
