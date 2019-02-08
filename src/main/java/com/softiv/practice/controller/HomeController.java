package com.softiv.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    HttpServletRequest httpServletRequest;

    @RequestMapping("/")
    public String home() {
        Map<String, Object> map = new HashMap();
        map.put("remoteUserName", httpServletRequest.getRemoteUser());
        map.put("userPrincipal", httpServletRequest.getUserPrincipal());
        map.put("isUSERRole", httpServletRequest.isUserInRole("USER"));
//        map.put("remoteUserName", httpServletRequest.login("user","password"););
        return "/index";
    }

    @RequestMapping("/login")
    public String login() {
        return "/login";
    }



}
