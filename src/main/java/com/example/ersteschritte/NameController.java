package com.example.ersteschritte;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NameController {

    @PostMapping("/nameneingabe")
    public String processForm(@RequestParam("userInput") String userInput){
        return "Hallo " + userInput;
    }


}
