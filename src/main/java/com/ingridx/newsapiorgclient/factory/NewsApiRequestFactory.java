package com.ingridx.newsapiorgclient.factory;

import com.ingridx.newsapiorgclient.request.EverythingRequest;

/**
 *
 * @author Mohammad
 */
public class NewsApiRequestFactory {

    /**
     *
     * @return
     */
    public static EverythingRequest createEverythingRequest() {
        EverythingRequestImpl everythingRequestImpl = new EverythingRequestImpl();
        return everythingRequestImpl;
    }
}
