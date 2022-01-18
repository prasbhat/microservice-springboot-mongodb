package com.myzonesoft.microservice.todo.repository;

import com.myzonesoft.microservice.todo.model.TodoTaskComments;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoTaskCommentsRepository extends MongoRepository<TodoTaskComments, String> {

}
