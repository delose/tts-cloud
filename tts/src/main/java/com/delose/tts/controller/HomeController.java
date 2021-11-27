package com.delose.tts.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        log.info("display home");
        return "home";
    }

    @PostMapping("/go-to-add-article")
    public String goToAddArticle() {
        return "redirect:/article";
    }
}
