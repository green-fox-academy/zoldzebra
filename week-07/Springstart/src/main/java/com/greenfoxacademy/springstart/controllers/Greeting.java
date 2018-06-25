package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  String content;
  static AtomicLong idCounter = new AtomicLong();
  long id;

  public Greeting() {
    this.id = idCounter.incrementAndGet();
    this.content = "Hello Worrrrld";
  }

  public Greeting (long id, String content) {
    this.id = idCounter.incrementAndGet();
    this.content = content;
  }

  public Greeting (String content) {
    this.id = idCounter.incrementAndGet();
    this.content = content;    
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
