import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;

public class AmazonScraper {

    public static void main(String[] args) throws IOException {

        String url = "https://www.amazon.com/best-sellers-books-Amazon/zgbs/books";
        Document PAGE = Jsoup.connect(url).userAgent("JSoup Scraper").get();

        String BookSelector = ".aok-inline-block.zg-item > .a-link-normal";
        Elements bookElements = PAGE.select(BookSelector);
        ArrayList<String> BookTitles = new ArrayList<>();

        for (Element e: bookElements) {
            BookTitles.add(e.text());
        }

        for (String s: BookTitles) {
            System.out.println(s);

        }

    }

}
