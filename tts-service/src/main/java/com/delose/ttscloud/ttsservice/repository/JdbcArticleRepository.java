package com.delose.ttscloud.ttsservice.repository;

import com.delose.ttscloud.ttsservice.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcArticleRepository implements ArticleRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcArticleRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Iterable<Article> findAll() {
        return jdbcTemplate.query("select * from ARTICLE",
                this::mapRowToArticle);
    }

    @Override
    public Article findOne(String id) {
        return jdbcTemplate.queryForObject("select * from ARTICLE where id=?",
                this::mapRowToArticle, id);
    }

    @Override
    public Article save(Article article) {
        jdbcTemplate.update("insert into ARTICLE (" +
                "summary,\n" +
                "country,\n" +
                "author,\n" +
                "link,\n" +
                "language,\n" +
                "media,\n" +
                "title,\n" +
                "mediaContent,\n" +
                "cleanUrl,\n" +
                "rights,\n" +
                "rank,\n" +
                "topic,\n" +
                "publishedDate,\n" +
                "id) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                article.getSummary(),
                article.getCountry(),
                article.getAuthor(),
                article.getLink(),
                article.getLanguage(),
                article.getMedia(),
                article.getTitle(),
                article.getMediaContent(),
                article.getCleanUrl(),
                article.getRights(),
                article.getRank(),
                article.getTopic(),
                article.getPublishedDate(),
                article.getId());

        return article;
    }

    private Article mapRowToArticle(ResultSet resultSet, int rowNum) throws SQLException {
        return new Article(
                resultSet.getString("summary"),
                resultSet.getString("country"),
                resultSet.getString("author"),
                resultSet.getString("link"),
                resultSet.getString("language"),
                resultSet.getString("media"),
                resultSet.getString("title"),
                resultSet.getString("mediaContent"),
                resultSet.getString("cleanUrl"),
                resultSet.getString("rights"),
                resultSet.getString("rank"),
                resultSet.getString("topic"),
                resultSet.getString("publishedDate"),
                resultSet.getInt("id")
        );
    }
}
