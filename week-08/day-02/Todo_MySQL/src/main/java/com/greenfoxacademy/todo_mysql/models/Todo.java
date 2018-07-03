package com.greenfoxacademy.todo_mysql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    String title;
    boolean urgent;
    boolean done;

    public Todo() {
        this.urgent = false;
        this.done = false;
    }

    public Todo(String text) {
        this.title = text;
        this.urgent = false;
        this.done = false;
    }

    public String getTitle() {
        return title;
    }
}
