package com.example.RupiTest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class inputData {

    @PostMapping("/submit")
    public String processForm(@RequestParam("name") String name) {
        // Process the form data
        // You can store or handle the name value as needed
        // For example, you could save it to a database or perform some business logic

        return "success"; // Return the name of the success view
    }
}
