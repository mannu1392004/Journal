package com.example.Journal.App.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "journal_entries")
public class journal_entries {
    private String title;
    private String Content;
    private ObjectId id;
    private Date date;

    @Id
    public ObjectId getId() {
        return id;
    }

    public journal_entries setId(ObjectId id) {
        this.id = id;
        return null;
    }

    public String getContent() {
        return Content;
    }

    public journal_entries setContent(String content) {
        Content = content;
        return null;
    }

    public String getTitle() {
        return title;
    }

    public journal_entries setTitle(String title) {
        this.title = title;
        return null;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
