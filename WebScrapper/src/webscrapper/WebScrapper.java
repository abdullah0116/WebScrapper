package webscrapper;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Abdullah
 */
public class WebScrapper {

    public static void main(String[] args) {
        
        try {
            Document doc;
            doc = Jsoup.connect("http://www.rentler.com/").get();
            Elements links = doc.select("a");
            for (Element elements: links) {
                System.out.println(elements.attr("abs:href"));
            }
        } catch (IOException ex) {
            Logger.getLogger(WebScrapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
//log(doc.title());
//        Elements newsHeadlines = doc.select("#mp-itn b a");
//        for (Element headline : newsHeadlines) {
//        log("%s\n\t%s", 
//        headline.attr("title"), headline.absUrl("href"));