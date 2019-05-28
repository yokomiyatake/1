import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class Scrap {

    public static void main(String[] args) {

        try {
            Document doc = Jsoup.connect("https://icanhazwordz.appspot.com").get();
            
            
            // ここから下は適当
            Elements elm = doc.select("title");
            for(Element elms : elm) {
                String title = elms.text();
                System.out.println(title);
            }

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}