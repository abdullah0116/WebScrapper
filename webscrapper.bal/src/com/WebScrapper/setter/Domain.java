package com.WebScrapper.setter;

import java.sql.Timestamp;

public class Domain {
    private String domainHash;
    private String domainURL;
    private boolean activated;
    private Timestamp modified;
    private Timestamp created;

    public String getDomainHASH() {

        return domainHash;
    }

    public String getDomainURL() {

        return domainURL;
    }

    public boolean getActivated() {

        return activated;
    }

    public Timestamp getModifiedStatus() {

        return modified;
    }

    public Timestamp getCreatedStatus() {

        return created;
    } 

    public Domain(String domainHash, String domainURL) {
        this.domainHash = domainHash;
        this.domainURL = domainURL;
    }

    //used when loading data from database

    public Domain(String domainHash, String domainURL, boolean activated, Timestamp modified, Timestamp created) {
        this.domainHash = domainHash;
        this.domainURL = domainURL;
        this.activated = activated;
        this.modified = modified;
        this.created = created;
    }
}