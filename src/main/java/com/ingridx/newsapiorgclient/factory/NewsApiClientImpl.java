package com.ingridx.newsapiorgclient.factory;

import com.ingridx.newsapiorgclient.NewsApiClient;
import com.ingridx.newsapiorgclient.configuration.Configuration;
import com.ingridx.newsapiorgclient.request.EverythingRequest;
import com.ingridx.newsapiorgclient.request.Request;
import com.ingridx.newsapiorgclient.response.ArticleResponse;
import com.ingridx.newsapiorgclient.response.Response;
import java.io.IOException;
import java.net.URI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Mohammad
 */
class NewsApiClientImpl implements NewsApiClient {

    private static final Logger LOG = LoggerFactory.getLogger(NewsApiClientImpl.class);

    static final String NEWS_API_URL = "https://newsapi.org/";
    static final String API_KEY_HEADER = "X-API-KEY";

    Configuration config;

    public NewsApiClientImpl(Configuration config) {
        this.config = config;
    }

    protected URI getUrl(Request req) {
        return URI.create(NEWS_API_URL)
                .resolve(config.getApiVersion().toString().concat("/")
                        .concat(req.getRequestUrl()));
    }

    @Override
    public Response execute(Request req) throws Exception {

        if (req instanceof EverythingRequest) {
            return this.executeEverythingReques((EverythingRequest) req);
        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected Response executeEverythingReques(EverythingRequest req) throws IOException {
        URI url = getUrl(req);
        org.apache.http.client.fluent.Request httpRequest = HttpClientFactory.getHttpRequest(url);
        org.apache.http.client.fluent.Response res = httpRequest.addHeader(API_KEY_HEADER, req.getApiKey()).execute();
        String strResponse = res.returnContent().asString();
        LOG.debug("Got result from newsapi url {}, result {}", url, strResponse);
        ArticleResponse result = GsonFactory.create().fromJson(strResponse, ArticleResponse.class);
        return result;
    }

}
