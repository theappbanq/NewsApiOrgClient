package com.ingridx.newsapiorgclient.response;

import java.util.List;

/**
 *
 * @author Mohammad
 */
public interface ArticleResponse extends Response {
  
    Integer getTotalResults();
    
    List<Article> getArticles();
}
