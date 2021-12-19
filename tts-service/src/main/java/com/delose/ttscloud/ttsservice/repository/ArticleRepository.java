package com.delose.ttscloud.ttsservice.repository;

import com.delose.ttscloud.ttsservice.domain.Article;

public interface ArticleRepository {

    Iterable<Article> findAll();

    Article findOne(String id);

    Article save(Article article);

}
