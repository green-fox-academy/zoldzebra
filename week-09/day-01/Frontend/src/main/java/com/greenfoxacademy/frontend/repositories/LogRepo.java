package com.greenfoxacademy.frontend.repositories;

import com.greenfoxacademy.frontend.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepo extends CrudRepository<Log, Long> {

}
