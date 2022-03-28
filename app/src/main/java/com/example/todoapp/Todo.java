package com.example.todoapp;

import java.util.Date;
import java.util.UUID;

public class Todo {

    private UUID id;
    private String title;
    private String description;
    private Date createdDate;

    public Todo(UUID id, String title, String description, Date createdDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdDate = createdDate;
    }

    public Todo() {
        id = UUID.randomUUID();
        createdDate = new Date();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
