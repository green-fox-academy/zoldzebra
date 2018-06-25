package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  String content;
  static AtomicLong idCounter = new AtomicLong();
  long id;
  String color;
  int fontsize;
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  String[] colors = {"blue", "red", "green", "black", "yellow", "darkgrey"};

  public Greeting() {
    this.id = idCounter.incrementAndGet();
    this.content = hellos[(int) (Math.random() * (hellos.length))];
    this.color = colors[(int) (Math.random() * (colors.length))];
    this.fontsize = 12 + ((int) (Math.random() * 40));
  }

  public Greeting (long id, String content) {
    this.id = idCounter.incrementAndGet();
    this.content = hellos[(int) (Math.random() * (hellos.length))] + " " + content;
    this.color = colors[(int) (Math.random() * (colors.length))];
    this.fontsize = 12 + ((int) (Math.random() * 40));
  }

  public Greeting (String content) {
    this.id = idCounter.incrementAndGet();
    this.content = hellos[(int) (Math.random() * (hellos.length))] + " " + content;
    this.color = colors[(int) (Math.random() * (colors.length))];
    this.fontsize = 12 + ((int) (Math.random() * 40));
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public String getColor() {
    return color;
  }

  public int getFontsize() {
    return fontsize;
  }
}
