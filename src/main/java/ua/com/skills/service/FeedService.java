package ua.com.skills.service;

import ua.com.skills.service.impl.News;

import java.util.List;

/**
 * Created by ваня on 04.01.2017.
 */
public interface FeedService {
    List<News> findNews();

}
