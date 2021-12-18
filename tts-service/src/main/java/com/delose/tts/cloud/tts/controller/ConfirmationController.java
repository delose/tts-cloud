package com.delose.tts.cloud.tts.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/confirmation")
public class ConfirmationController {

    @GetMapping("/save")
    public String save(Model model) {
        // TODO: add attribute
        return "saved";
    }

    @PostMapping("/go-back")
    public String goBackHome() {
        return "redirect:/";
    }
}
