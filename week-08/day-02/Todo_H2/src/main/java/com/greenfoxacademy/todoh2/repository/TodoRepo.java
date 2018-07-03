package com.greenfoxacademy.todoh2.repository;

import com.greenfoxacademy.todoh2.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Long> {



}
