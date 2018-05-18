package com.WebScrapper.setter;

import java.sql.Timestamp;

public class Anchor {
    private Domain domain;
    private String anchorHash;
    private String anchorURL;
    private int scanStatus; 
    private boolean activated;
    private Timestamp modified;
    private Timestamp created;
    
    public Domain getDomain() {
        return domain;
    }
    
    public String getAnchorHash() {
        return anchorHash;
    }
    
    public String getAnchorURL() {
        return anchorURL;
    }
    
    public int getScanSTAT() {
        return scanStatus;
    }
    
    public boolean getActiviationSTAT() {
        return activated;
    }
    
    public Timestamp getModifiedSTAT() {
        return modified;
    }

    public Timestamp getCreationSTAT() {
        return created;
    }    
    
    public Anchor(Domain domain, String anchorHash, String anchorURL) {
        this.domain = domain;
        this.anchorHash = anchorHash;
        this.anchorURL = anchorURL;
    }

    public Anchor(Domain domain, String anchorHash, String anchorURL, int scanStatus, 
        boolean activated, Timestamp modified, Timestamp created) {
        this.domain = domain;
        this.anchorHash = anchorHash;
        this.anchorURL = anchorURL;
        this.scanStatus = scanStatus;
        this.activated = activated; 
        this.modified = modified; 
        this.created = created; 
    }
}