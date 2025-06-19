package com.jeongmin.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/")
    //@ResponseBody //문자 그대로 보내주세요~
    String hello(){
        return "index.html";
    }

    @GetMapping("/about")
    @ResponseBody
    String about(){
        return "느금마";
    }
}
