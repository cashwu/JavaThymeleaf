package com.cashwu.javathymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author cash.wu
 * @since 2024/04/30
 */
@Controller
public class MainController {

//    @GetMapping("/home")
//    public String home(Model page,
//                       @RequestParam(required = false) String color,
//                       @RequestParam(required = false) String name) {
//        page.addAttribute("username", name);
//        page.addAttribute("color", color);
//
//        return "home";
//    }
    @GetMapping("/home/{color}")
    public String home(Model page,
                       @PathVariable String color) {
        page.addAttribute("username", "cash");
        page.addAttribute("color", color);

        return "home";
    }
}

