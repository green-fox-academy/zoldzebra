package com.greenfoxacademy.frontend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private LocalDateTime createdAt;
  private String endpoint;
  private String data;

  public Log() {}

  public Log(String endpoint, String data) {
    this.createdAt = LocalDateTime.now();
    this.endpoint = endpoint;
    this.data = data;
    System.out.println("Log created.");
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public void setData(String data) {
    this.data = data;
  }
}
