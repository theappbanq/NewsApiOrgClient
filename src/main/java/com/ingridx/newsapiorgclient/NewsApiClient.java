package com.ingridx.newsapiorgclient;

import com.ingridx.newsapiorgclient.request.Request;
import com.ingridx.newsapiorgclient.response.Response;

/**
 *
 * @author Mohammad
 */
public interface NewsApiClient {
    Response execute(Request req) throws Exception;
}
