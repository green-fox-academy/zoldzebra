package com.greenfoxacademy.todo_mysql.repository;

import com.greenfoxacademy.todo_mysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Long> {

}
