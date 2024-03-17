package org.example.controller;

import org.example.annotation.Controller;
import org.example.annotation.RequestMapper;
import org.example.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HealthCheckController {
    
    @RequestMapper(value = "/health", method = RequestMethod.GET)
    public String health(HttpServletRequest request, HttpServletResponse response) {
        return "health";
    }
    
}
