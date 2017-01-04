package ua.com.skills.service.impl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import ua.com.skills.service.FeedService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ваня on 04.01.2017.
 */
@Service
public class FeedServiceImpl implements FeedService {
    @Override
    public List<News> findNews() {
        Document document = null;
        ArrayList<News> newses = null;
        try {
            document = Jsoup.connect("https://dou.ua/calendar/").get();
            newses = new ArrayList<>();
            Elements newsElements = document.select("article.b-postcard");
            for (Element element : newsElements) {
                String title = element.select("h2.title").text();
                String desc = element.select("p.b-typo").text();
                String date = element.select("div.when-and-where").text();
                String path = element.select("img.logo").attr("src");
                String href = element.select("h2.title>a").attr("href");
                News news = new News(title, desc, date,path,href);
                newses.add(news);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newses;
    }
}
