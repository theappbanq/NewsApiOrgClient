package com.ingridx.newsapiorgclient.adapter;

import com.ingridx.newsapiorgclient.response.Article;
import com.ingridx.newsapiorgclient.response.ArticleResponse;
import java.util.List;


class ArticleResponseImpl implements ArticleResponse {

    Integer totalResults;
    String status;
    String code;
    String message;
    List<Article> articles;
    
    @Override
    public Integer getTotalResults() {
        return totalResults;
    }

    @Override
    public List<Article> getArticles() {
        return articles;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
    
    
    
}
