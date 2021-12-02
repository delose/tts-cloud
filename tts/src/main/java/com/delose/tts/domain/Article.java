package com.delose.tts.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * input data
 */
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Article {

    @NotBlank(message="summary is required")
    private String summary;
    private String country;
    private String author;
    private String link;
    private String language;
    private String media;
    @NotBlank(message="title is required")
    private String title;
    private String mediaContent;
    private String cleanUrl;
    private String rights;
    private String rank;
    private String topic;
    private String publishedDate;
    private String id;

}
