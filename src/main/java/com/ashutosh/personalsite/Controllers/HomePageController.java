package com.ashutosh.personalsite.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name","Ashutosh Mishra");
        return "index";
    }

}
