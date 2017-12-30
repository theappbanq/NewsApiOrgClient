package com.ingridx.newsapiorgclient.factory;

import java.net.URI;
import org.apache.http.client.fluent.Request;

/**
 *
 * @author Mohammad
 */
public class HttpClientFactory {
    public static Request getHttpRequest(URI uri) {
        return Request.Get(uri);
    }
    
    public static Request postHttpRequest(String url) {
        return Request.Post(url);
    }
}
