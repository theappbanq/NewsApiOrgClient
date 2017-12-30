package com.ingridx.newsapiorgclient.factory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ingridx.newsapiorgclient.response.Article;
import com.ingridx.newsapiorgclient.response.ArticleResponse;
import com.ingridx.newsapiorgclient.adapter.ArticleResponseTypeAdapter;
import com.ingridx.newsapiorgclient.adapter.ArticleTypeAdapter;
import com.ingridx.newsapiorgclient.response.Source;
import com.ingridx.newsapiorgclient.adapter.SourceTypeAdapter;

/**
 *
 * @author Mohammad
 */
public class GsonFactory {
    public static Gson create() {
        return new GsonBuilder()
                .registerTypeAdapter(ArticleResponse.class, new ArticleResponseTypeAdapter())
                .registerTypeAdapter(Article.class, new ArticleTypeAdapter())
                .registerTypeAdapter(Source.class, new SourceTypeAdapter())
                .create();
    }
}
