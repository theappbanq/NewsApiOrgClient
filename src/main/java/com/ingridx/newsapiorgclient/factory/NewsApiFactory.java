package com.ingridx.newsapiorgclient.factory;

import com.ingridx.newsapiorgclient.NewsApiClient;
import com.ingridx.newsapiorgclient.configuration.Configuration;

/**
 *
 * @author Mohammad
 */
public class NewsApiFactory {
    
    public static NewsApiClient create(Configuration config) {
        return new NewsApiClientImpl(config);
    }
}
