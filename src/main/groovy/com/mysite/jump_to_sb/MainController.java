package com.mysite.jump_to_sb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/jtt")
    @ResponseBody
    public String index() {
        System.out.println("index");
        return "윤석열 \uD83E\uDE77 이재명";
    }
}
