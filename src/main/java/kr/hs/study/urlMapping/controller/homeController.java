package kr.hs.study.urlMapping.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/test1")
    public String home2(){
        return "test1";
    }

    @GetMapping("/sub1/test2")
    public String home3(){
        return "test2";
    }

    @GetMapping("/sub2/test3")
    public String home4(){
        return "test3";
    }
}
