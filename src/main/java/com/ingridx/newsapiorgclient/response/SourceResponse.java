package com.ingridx.newsapiorgclient.response;

import java.util.List;

/**
 *
 * @author Mohammad
 */
public interface SourceResponse extends Response {
      
    List<Source> getSources();
}
