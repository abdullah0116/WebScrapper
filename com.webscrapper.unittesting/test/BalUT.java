/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import WebScrapper.*;
/**
 *
 * @author Abdullah
 */
public class BalUT {
    
    public BalUT() {
    }
    
    @Test
    public void checkWebPageFromWEB() {
        Domain d = new Domain("1234-124","https://www.jsoup.org");
        Anchor anchor = new Anchor(d, "1234-124", "https://www.jsoup.org");
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
