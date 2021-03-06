package com.epam.newsmanager.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * One news
 */
public class News implements Serializable {

    public static final long serialVersionUID = 1;

    /**
     * Unique identifier
     */
    private long newsId;

    /**
     * News title
     */
    private String title;

    /**
     * News short text
     */
    private String shortText;

    /**
     * News full text
     */
    private String fullText;

    /**
     * News creation date
     */
    private Timestamp creationDate;

    /**
     * News modification date
     */
    private Date modificationDate;

    public News() {
    }

    public long getNewsId() {
        return newsId;
    }

    public void setNewsId(long newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", title='" + title + '\'' +
                ", shortText='" + shortText + '\'' +
                ", fullText='" + fullText + '\'' +
                ", creationDate=" + creationDate +
                ", modificationDate=" + modificationDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        News news = (News) o;

        if (newsId != news.newsId) {
            return false;
        }
        if (title != null ? !title.equals(news.title) : news.title != null) {
            return false;
        }
        if (shortText != null ? !shortText.equals(news.shortText) : news.shortText != null) {
            return false;
        }
        if (fullText != null ? !fullText.equals(news.fullText) : news.fullText != null) {
            return false;
        }
        if (creationDate != null ? !creationDate.equals(news.creationDate) : news.creationDate != null) {
            return false;
        }
        return !(modificationDate != null ? !modificationDate.equals(news.modificationDate) : news.modificationDate != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (newsId ^ (newsId >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (shortText != null ? shortText.hashCode() : 0);
        result = 31 * result + (fullText != null ? fullText.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (modificationDate != null ? modificationDate.hashCode() : 0);
        return result;
    }
}
