package com.transport.bus_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {
    @GetMapping("/login")
    public String login(){
        return "registrationPage";
    }
    @RequestMapping(value = "register" ,method = RequestMethod.POST)
    public String welcomePage(@RequestParam ModelAttribute userDetails, ModelMap model)
    {
        model.addAttribute("name",userDetails.name());
        return "registrationPage";
    }

    @RequestMapping(value = "register",method = RequestMethod.GET)
    public String showWelcomePage(ModelMap model){
        // model.put("name",)
        return "registrationPage";
    }

    @RequestMapping(value = "searchBus",method = RequestMethod.GET)
    public String searchBus(ModelMap model){
        // model.put("name",)
        return "searchBus";
    }
}
