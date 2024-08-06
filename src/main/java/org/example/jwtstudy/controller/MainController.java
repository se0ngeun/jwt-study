package org.example.jwtstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody // 웹이 아닌 객체나 문자열을 반환
public class MainController {

    @GetMapping("/")
    public String mainP() {
        return "Main Controller";
    }
}

