package com.ingridx.newsapiorgclient.adapter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.ingridx.newsapiorgclient.response.Source;
import java.lang.reflect.Type;

/**
 *
 * @author Mohammad
 */
public class SourceTypeAdapter implements JsonSerializer<Source>, JsonDeserializer<Source>{

    @Override
    public JsonElement serialize(Source src, Type typeOfSrc, JsonSerializationContext context) {
        return context.serialize(src);
    }

    @Override
    public Source deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return context.deserialize(json, SourceImpl.class);
    }
    
}
