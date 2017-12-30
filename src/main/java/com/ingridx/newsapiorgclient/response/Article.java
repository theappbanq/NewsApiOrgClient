package com.ingridx.newsapiorgclient.response;

import java.util.Date;

/**
 *
 * @author Mohammad
 */
public interface Article {
    Source getSource();
    String getAuthor();
    String getTitle();
    String getDescription();
    String getUrl();
    String getUrlToImage();
    Date getPublishedAt();
}
