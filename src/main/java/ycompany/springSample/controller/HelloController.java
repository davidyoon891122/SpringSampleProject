package ycompany.springSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String helloController(Model model) {
        model.addAttribute("data", "davidyoon");
        return "hello-basic-template";
    }

}
