package com.ingridx.newsapiorgclient.factory;

import com.ingridx.newsapiorgclient.request.EverythingRequest;
import com.ingridx.newsapiorgclient.request.Request;
import com.ingridx.newsapiorgclient.request.Sort;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Mohammad
 */
class EverythingRequestImpl implements EverythingRequest {

    String q;
    String sources;
    String domains;
    int page = 0;
    Date from;
    Date to;
    String lang;
    String apiKey;
    Sort sort = Sort.PublishedAt;

    private boolean isNullOrEmpty(String str) {
        return null == str || str.isEmpty();
    }

    @Override
    public EverythingRequest sortBy(Sort sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public EverythingRequest q(String q) {
        this.q = q;
        return this;
    }

    @Override
    public EverythingRequest addSource(String source) {
        if (isNullOrEmpty(sources)) {
            sources = source;
        } else {
            sources = sources.concat(",".concat(source));
        }
        return this;
    }

    @Override
    public EverythingRequest addDomain(String domain) {
        if (isNullOrEmpty(domains)) {
            domains = domain;
        } else {
            domains = domains.concat(",".concat(domain));
        }
        return this;
    }

    @Override
    public EverythingRequest page(int pageNumber) {
        this.page = pageNumber;
        return this;
    }

    @Override
    public EverythingRequest from(Date from) {
        this.from = from;
        return this;
    }

    @Override
    public EverythingRequest to(Date to) {
        this.to = to;
        return this;
    }

    @Override
    public Request language(String lang) {
        this.lang = lang;
        return this;
    }

    @Override
    public String getRequestUrl() {
        StringBuilder sb = new StringBuilder()
                .append("/everything?")
                .append(String.format("q=%s", q));
        addParameter(sb, "sources", sources);
        addParameter(sb, "domains", domains);
        addParameter(sb, "lang", lang);
        addParameter(sb, "sortBy", sort.toString());
        if (page != 0) {
            addParameter(sb, "page", String.valueOf(page));
        }
        addParameter(sb, "from", from);
        addParameter(sb, "to", to);

        return sb.toString();
    }

    private StringBuilder addParameter(StringBuilder sb, String param, String value) {
        if (!isNullOrEmpty(value)) {
            sb.append("&").append(param).append("=").append(value);
        }

        return sb;
    }

    private StringBuilder addParameter(StringBuilder sb, String param, Date value) {
        if (null != value) {
            sb.append("&").append(param).append("=").append(formatDate(value));
        }

        return sb;
    }

    private String formatDate(Date date) {
        return DateTimeFormatter.ISO_DATE_TIME.format(date.toInstant().atZone(ZoneId.of("UTC")));
    }

    @Override
    public Request apiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    @Override
    public String getApiKey() {
        return apiKey;
    }

}
