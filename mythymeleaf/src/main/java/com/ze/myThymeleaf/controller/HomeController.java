package com.ze.myThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //경로 매핑을 하지 않으면 자동으로 첫 페이지로 로딩
    @GetMapping
    public String index() {
        return "index.html";
    }

}
