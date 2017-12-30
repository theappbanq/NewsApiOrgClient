package com.ingridx.newsapiorgclient.factory;

import com.ingridx.newsapiorgclient.request.Sort;
import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mohammad
 */
public class EverythingRequestImplTest {
    
    public EverythingRequestImplTest() {
    }

    @Test
    public void testGetRequestUrl() {
        Instant inst = Instant.parse("2017-12-30T00:00:00Z");
        String expectedResult = "/everything?q=test&sources=testsource&domains=test.com&sortBy=popularity&page=1&from=2017-12-30T00:00:00Z[UTC]&to=2017-12-30T00:00:00Z[UTC]";
        String requestUrl = new EverythingRequestImpl()
                .from(Date.from(inst))
                .to(Date.from(inst))
                .q("test")
                .page(1)
                .sortBy(Sort.Popularity)
                .addDomain("test.com")
                .addSource("testsource").getRequestUrl();
        assertNotNull(requestUrl);
        assertNotEquals("", requestUrl);
        assertEquals(expectedResult, requestUrl);
    }
    
}
