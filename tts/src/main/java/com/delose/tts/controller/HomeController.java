package com.delose.tts.controller;

import com.delose.tts.domain.Article;
import com.delose.tts.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class HomeController {

    private final ArticleRepository articleRepository;

    @Autowired
    public HomeController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Autowired
    private Environment env;
//    @Value("${spring.profiles.active}")
//    private String activeProfile;

    @GetMapping("/")
    public String home(Model model) {
        List<Article> articleList = new ArrayList<>();
        for (Article article : articleRepository.findAll()) {
            articleList.add(article);
        }
        log.info("number of articles: {} ", Integer.valueOf(articleList.size()));
        model.addAttribute("articles", articleList);
        model.addAttribute("active", env.getActiveProfiles());
        log.info("display home");
        return "home";
    }

    @PostMapping("/go-to-add-article")
    public String goToAddArticle() {
        return "redirect:/article";
    }
}
