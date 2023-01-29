package com.driver;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.time.LocalDate;
import java.util.Date;

public class Message {

    private int id=0;
    private String content;
    private LocalDate timestamp;

    public Message(String content) {
        this.id++;
        this.content = content;
        this.timestamp = LocalDate.now();
    }

    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }
}
