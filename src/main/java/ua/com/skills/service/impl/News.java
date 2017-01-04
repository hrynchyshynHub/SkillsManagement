package ua.com.skills.service.impl;

/**
 * Created by ваня on 04.01.2017.
 */
public class News {
    private String title;
    private String description;
    private String date;
    private String pathToImage;
    private String href;

    public News(String title, String description, String date, String pathToImage,String href) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.pathToImage = pathToImage;
        this.href = href;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
