package com.ingridx.newsapiorgclient.factory;

import com.ingridx.newsapiorgclient.configuration.Configuration;
import com.ingridx.newsapiorgclient.response.ArticleResponse;
import com.ingridx.newsapiorgclient.response.Response;
import java.net.URI;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mohammad
 */
public class NewsApiClientImplTest {
       
    //This is an API key for the test proposes and please don't use it in production
    static final String API_KEY = "d2b7bea7395c499a999e5b2c54eb79de";
    
    public NewsApiClientImplTest() {
    }
    
    

    @Test
    public void testGetUrl() {
        NewsApiClientImpl client = (NewsApiClientImpl) NewsApiFactory.create(new Configuration()
                .apiVersion(Configuration.ApiVersion.V2));
        
        URI url = client.getUrl(NewsApiRequestFactory.createEverythingRequest().q("test"));
        assertNotNull(url);
    }

    @Test
    public void testExecute() throws Exception {
        NewsApiClientImpl client = (NewsApiClientImpl) NewsApiFactory.create(new Configuration()
                .apiVersion(Configuration.ApiVersion.V2));
        
        Response res = client.execute(NewsApiRequestFactory
                .createEverythingRequest().q("bitcoin")
                .apiKey(API_KEY)
        );
        assertNotNull(res);
        assertTrue(res instanceof ArticleResponse);
        ArticleResponse ares = (ArticleResponse) res;
        assertTrue(ares.getArticles().size() > 0);
        assertTrue(ares.getTotalResults() > 0);
        assertEquals("OK", ares.getStatus().toUpperCase());
        assertNull(ares.getCode());
        assertNull(ares.getMessage());
    }

    @Test
    public void testExecuteEverythingReques() throws Exception {
    }
    
}
