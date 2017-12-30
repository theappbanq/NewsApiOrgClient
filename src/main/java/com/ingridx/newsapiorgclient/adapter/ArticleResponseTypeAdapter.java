package com.ingridx.newsapiorgclient.adapter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.ingridx.newsapiorgclient.response.ArticleResponse;
import java.lang.reflect.Type;

/**
 *
 * @author Mohammad
 */
public class ArticleResponseTypeAdapter implements JsonSerializer<ArticleResponse>, JsonDeserializer<ArticleResponse>{

    @Override
    public JsonElement serialize(ArticleResponse src, Type typeOfSrc, JsonSerializationContext context) {
        return context.serialize(src);
    }

    @Override
    public ArticleResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return context.deserialize(json, ArticleResponseImpl.class);
    }
    
}
