package com.issp.ISPP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

@GetMapping(value = "/home")
    public String goHome(Model model){

    model.addAttribute("texto","prueba1234");
    return "home";
}
}
