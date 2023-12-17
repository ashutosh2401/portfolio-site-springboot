package com.ashutosh.personalsite.Controllers;

import com.ashutosh.personalsite.Constants.PersonalSiteConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorPageController {

    @GetMapping
    public String getErrorPage() {
        return PersonalSiteConstants.ERROR;
    }
}
