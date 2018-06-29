package com.greenfoxacademy.programmerfoxclub.Models;

import java.util.ArrayList;
import java.util.List;

public class TrickList {

  private List<Trick> trickList;

  public TrickList() {
    Trick trick0 = new Trick();
    this.trickList = new ArrayList<>();
    //trickList.add(trick0);
  }

  public List<Trick> getTrickList() {
    return trickList;
  }

  public void setTrickList(List<Trick> trickList) {
    this.trickList = trickList;
  }

}
