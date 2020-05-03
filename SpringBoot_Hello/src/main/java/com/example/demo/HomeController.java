package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/Home")
public class HomeController
{
    @RequestMapping("/Hello")
    public void Hello  (HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        response.getWriter().println("Hello spring boot!");
    }
}