package com.delose.tts.controller;

import com.delose.tts.domain.Article;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import static org.slf4j.LoggerFactory.getLogger;

@Controller
@RequestMapping("/article")
public class ArticleController {

    private static final Logger log = getLogger(ArticleController.class);

    @GetMapping
    public String showArticle(Model model) {
        model.addAttribute("article", new Article());
        log.info("show article");
        return "article-display";
    }

    @PostMapping
    public String processArticle(@Valid Article article, Errors errors) {

        // validation
        if (errors.hasErrors()) {
            log.error("validation errors: {} ", errors.getAllErrors().toString());
            return "article-display";
        }

        log.info("saving article");
        return "redirect:/confirmation/save";
    }
}
