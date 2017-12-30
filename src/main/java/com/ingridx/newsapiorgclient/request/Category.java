package com.ingridx.newsapiorgclient.request;

/**
 *
 * @author Mohammad
 */
public enum Category {
    Business("business"), 
    Entertainment("entertainment"),
    gaming("gaming"),
    General("general"),
    HealthAndMedical("health-and-medical"),
    Music("music"),
    Politics("politics"),
    ScienceAndNature("science-and-nature"),
    Sport("sport"),
    Technology("technology");
    
    String value;
    Category(String val) {
        this.value = val;
    }

    @Override
    public String toString() {
        return value;
    }
    
}
