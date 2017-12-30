package com.ingridx.newsapiorgclient.request;

/**
 *
 * @author Mohammad
 */
public interface Request {

    Request language(String lang);
    
    Request apiKey(String apiKey);
    
    String getApiKey();

    String getRequestUrl();
}
