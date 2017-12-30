package com.ingridx.newsapiorgclient.configuration;

/**
 *
 * @author Mohammad
 */
public class ConfigurationBuilder {

    private Configuration instance;

    public ConfigurationBuilder() {
        this.instance = new Configuration();
    }
    
    public ConfigurationBuilder apiVersion(Configuration.ApiVersion apiVersion) {
        this.instance.apiVersion(apiVersion);
        return this;
    }
    
    public Configuration build() {
        try {
        return instance;
        }
        finally {
            instance = null;
        }
    }
}
