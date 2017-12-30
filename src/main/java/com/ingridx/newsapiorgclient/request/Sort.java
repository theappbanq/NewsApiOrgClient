package com.ingridx.newsapiorgclient.request;

/**
 *
 * @author Mohammad
 */
public enum Sort {
    Relevancy, Popularity, PublishedAt;

    @Override
    public String toString() {
        char[] chars = this.name().toCharArray();
        chars[0] = Character.toLowerCase(chars[0]);
        return String.valueOf(chars);
    }
    
}
