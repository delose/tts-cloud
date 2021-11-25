package com.delose.ttscloud.controller;

import com.delose.ttscloud.domain.Article;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
