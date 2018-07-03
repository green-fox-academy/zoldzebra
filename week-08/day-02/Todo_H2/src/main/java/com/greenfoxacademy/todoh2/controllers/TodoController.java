package com.greenfoxacademy.todoh2.controllers;

import com.greenfoxacademy.todoh2.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/todo")
public class TodoController {

    @Autowired
    TodoRepo todoRepo;

    @RequestMapping ("")
    public String show(Model model) {
        return "todolist";
    }

    @RequestMapping ("/list")
    public String showList(Model model) {
        model.addAttribute("todos", todoRepo.findAll());
        return "todolist";
    }



}
