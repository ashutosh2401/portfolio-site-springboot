package com.ashutosh.personalsite.Controllers;

import com.ashutosh.personalsite.Constants.PersonalSiteConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute(PersonalSiteConstants.NAME, PersonalSiteConstants.MY_NAME);
        return "index";
    }

}
