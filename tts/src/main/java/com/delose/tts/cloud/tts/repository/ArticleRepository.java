package com.delose.tts.cloud.tts.repository;

import com.delose.tts.cloud.tts.domain.Article;

public interface ArticleRepository {

    Iterable<Article> findAll();

    Article findOne(String id);

    Article save(Article article);

}
