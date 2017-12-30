package com.ingridx.newsapiorgclient.request;

import java.util.Date;

/**
 *
 * @author Mohammad
 */
public interface EverythingRequest extends Request {

    EverythingRequest sortBy(Sort sort);

    EverythingRequest q(String q);

    EverythingRequest addSource(String source);

    EverythingRequest addDomain(String domain);

    EverythingRequest page(int pageNumber);

    EverythingRequest from(Date from);

    EverythingRequest to(Date to);

}
