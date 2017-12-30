package com.ingridx.newsapiorgclient.adapter;

import com.ingridx.newsapiorgclient.response.Article;
import com.ingridx.newsapiorgclient.response.Source;
import java.util.Date;


class ArticleImpl implements Article {

    Source source;
    String author;
    String title;
    String description;
    String url;
    String urlToImage;
    Date publishedAt; 
    
    @Override
    public Source getSource() {
        return source;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public String getUrlToImage() {
        return urlToImage;
    }

    @Override
    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }
    
}
