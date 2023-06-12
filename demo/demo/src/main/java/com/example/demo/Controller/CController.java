package com.example.demo.Controller;

import com.example.demo.Configuration.SpringConfig;
import com.example.demo.Models.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CController {
    @Autowired
    SpringConfig springConfig;
    @RequestMapping("/user")
    public List<UserInfo> getUserInfo(){
        return Arrays.asList(new UserInfo("Aayush", 28, "29-12-1995"),
                new UserInfo("Aayush", 28, "29-12-1996"));
    }
    @RequestMapping("/config")
    public SpringConfig checkConfig(){
        return springConfig;
    }
}
