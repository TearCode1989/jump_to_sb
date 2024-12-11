package com.mysite.jump_to_sb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/newStart")
    @ResponseBody
    public String hello() {
        return "372482398478293";
    }
}
