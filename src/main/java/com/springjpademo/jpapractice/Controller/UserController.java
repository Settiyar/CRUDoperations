package com.springjpademo.jpapractice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/handle")
    @ResponseBody

    public String handling() {
        return "Handled!!!!!";

    }

}
