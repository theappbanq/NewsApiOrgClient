package com.ingridx.newsapiorgclient.configuration;

/**
 *
 * @author Mohammad
 */
public class Configuration {

    public enum ApiVersion {
        V1("v1"),
        V2("v2");
        
        String value;
        
        ApiVersion(String value) {
            this.value = value;
        }
        
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
                
    }
    
    
    private ApiVersion apiVersion;

    /**
     * Get the value of apiVersion
     *
     * @return the value of apiVersion
     */
    public ApiVersion getApiVersion() {
        return apiVersion;
    }

    /**
     * Set the value of apiVersion
     *
     * @param apiVersion new value of apiVersion
     */
    public void setApiVersion(ApiVersion apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Configuration apiVersion(final ApiVersion value) {
        this.apiVersion = value;
        return this;
    }

    public Configuration() {
        this.apiVersion = ApiVersion.V2;
    }
    
}
