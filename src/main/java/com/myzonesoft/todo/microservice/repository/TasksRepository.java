package com.myzonesoft.todo.microservice.repository;

import com.myzonesoft.todo.microservice.model.Tasks;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends MongoRepository<Tasks, String> {

}
