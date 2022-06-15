package com.myzonesoft.todo.microservice.repository;

import com.myzonesoft.todo.microservice.model.TodoTaskComments;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoTaskCommentsRepository extends MongoRepository<TodoTaskComments, String> {

}
