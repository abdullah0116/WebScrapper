package com.WebScrapper.setter;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import webscrapper.WebScrapper;

public class WebPage {
    private Anchor anchor; 
    private String webPageHash; 
    private Document webDoc;
    private int anchorParseStatus;
    private int emailParseStatus;

    public WebPage(Anchor anchor) {
        this.anchor = anchor;
    }
    public Document getDoc() {
        return webDoc;
    }
    public void getWebDoc() {
        try {
            webDoc = Jsoup.connect(anchor.getAnchorURL()).get();
            Elements links = webDoc.select("a");
            for (Element elements : links) {
                System.out.println(elements.attr("abs:href"));
            }
        } catch (IOException ex) {
            Logger.getLogger(WebScrapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}