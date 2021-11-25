package com.delose.tts.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * input data
 */
@Data
@RequiredArgsConstructor
public class Article {

    private String summary;
    private String country;
    private String author;
    private String link;
    private String language;
    private String media;
    private String title;
    private String mediaContent;
    private String cleanUrl;
    private String rights;
    private String rank;
    private String topic;
    private String publishedDate;
    private String id;
}
