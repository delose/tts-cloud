package com.delose.tts.repository;

import com.delose.tts.domain.Article;

public interface ArticleRepository {

    Iterable<Article> findAll();

    Article findOne(String id);

    Article save(Article article);

}
