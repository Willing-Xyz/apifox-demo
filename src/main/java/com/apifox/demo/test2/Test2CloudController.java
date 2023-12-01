package com.apifox.demo.test2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudApi/test")
public class Test2CloudController {

    @GetMapping("/api2")
    public ApiVO api2() {
        return null;
    }

}
