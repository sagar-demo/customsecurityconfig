package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class forgotpassword {
	 @GetMapping("/forgot-password")
	    public String forgotPasswordPage() {
	        return "forgot-password";
	    }

}
