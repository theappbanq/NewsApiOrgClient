package com.ingridx.newsapiorgclient.adapter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.ingridx.newsapiorgclient.response.Article;
import java.lang.reflect.Type;

/**
 *
 * @author Mohammad
 */
public class ArticleTypeAdapter implements JsonSerializer<Article>, JsonDeserializer<Article>{

    @Override
    public JsonElement serialize(Article src, Type typeOfSrc, JsonSerializationContext context) {
        return context.serialize(src);
    }

    @Override
    public Article deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return context.deserialize(json, ArticleImpl.class);
    }
    
}
