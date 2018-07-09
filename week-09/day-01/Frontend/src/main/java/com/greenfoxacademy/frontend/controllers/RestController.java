package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.*;
import com.greenfoxacademy.frontend.models.Error;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      Doubling doubling = new Doubling(input);
      return doubling;
    } else {
      Error error = new Error("Please provide an input!");
      return error;
    }
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new Error("Please provide a name!");
    } else if (title == null) {
      return new Error("Please provide a title!");
    } else {
      return new Greeting(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appenda(@PathParam(value = "appendable") String input) {
    if (input == null) {
      return null;
    } else {
      return new Appenda(input);
    }
  }

  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable(value = "what") String what,
                        @RequestBody Until until) {
    return new DoUntil(what, until.getUntil());
  }

  @ExceptionHandler({HttpMessageNotReadableException.class})
  public Error doUntilError() {
    return new Error("Please provide a number!");
  }

}
