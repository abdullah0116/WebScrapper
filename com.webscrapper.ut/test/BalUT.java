/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.WebScrapper.setter.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abdullah
 */
public class BalUT {
    
    public BalUT() {
    }
    @Test 
    public void webPageLoadFromWeb() {
        Domain domain = new Domain("1234-124", "https://www.jsoup.org");
        Anchor anchor = new Anchor(domain, "1234-124", "https://www.jsoup.org");
        WebPage webPage = new WebPage(anchor);
        webPage.getWebDoc();
        assertTrue("test results:", webPage.getDoc() != null);
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
