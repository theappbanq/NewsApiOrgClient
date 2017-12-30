package com.ingridx.newsapiorgclient.adapter;

import com.google.gson.annotations.SerializedName;
import com.ingridx.newsapiorgclient.response.Source;


class SourceImpl implements Source {

    String id;
    @SerializedName("name")
    String displayName;
    
    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    
}
