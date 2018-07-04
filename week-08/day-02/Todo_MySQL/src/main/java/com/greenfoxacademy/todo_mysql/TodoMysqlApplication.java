package com.greenfoxacademy.todo_mysql;

import com.greenfoxacademy.todo_mysql.models.Todo;
import com.greenfoxacademy.todo_mysql.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoMysqlApplication implements CommandLineRunner {

    @Autowired
    TodoRepo todoRepo;

    public static void main(String[] args)  {
        SpringApplication.run(TodoMysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Todo todo0 = new Todo("I have to learn Object Relational Mapping");
        todoRepo.save(todo0);
        Todo todo1 = new Todo("Not to go crazy because of java annotations");
        todoRepo.save(todo1);
        Todo todo2 = new Todo("Add a new task");
        todoRepo.save(todo2);
    }
}
