package com.project.formreg;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


 @Controller
public class control1 {
    @RequestMapping("/register")
    public String registerform(@ModelAttribute("frm") forms frm) 
    {
        return "registerform";
    }

    @RequestMapping("/registersuccess")
    public String registersucc(@ModelAttribute ("frm") forms frm) 
    {
        return "success";
    }
}




