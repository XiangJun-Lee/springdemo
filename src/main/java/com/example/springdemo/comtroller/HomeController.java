package com.example.springdemo.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Lee
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String gethome(){
        return "home";
    }
}
