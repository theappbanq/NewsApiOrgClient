package com.ingridx.newsapiorgclient.request;

/**
 *
 * @author Mohammad
 */
public interface TopHeadlinesRequest extends Request {

    TopHeadlinesRequest category(Category category);

    TopHeadlinesRequest country(String country);

    EverythingRequest q(String q);

    EverythingRequest addSource(String source);
}
