package com.myzonesoft.microservice.todo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@SuppressWarnings("unused")
public class TodoTaskComments {
    /**
     * Unique Identifier for the To-do task Comments
     */
    @Id
    private String todoTaskCommentsId;

    private String taskComments;
    private LocalDate creationDate;

    //Constructors

    /**
     * Default Constructor without any parameters
     */
    public TodoTaskComments() {
    }

    /**
     * Constructor with all parameters
     * @param taskComments Comments for the to do task
     * @param creationDate System generated creation date of the comments
     */
    public TodoTaskComments(String taskComments, LocalDate creationDate) {
        this.taskComments = taskComments;
        this.creationDate = creationDate;
    }

    //Getters and setters for all the private variables declared above

    public String getTodoTaskCommentsId() {
        return todoTaskCommentsId;
    }

    public void setTodoTaskCommentsId(String todoTaskCommentsId) {
        this.todoTaskCommentsId = todoTaskCommentsId;
    }

    public String getTaskComments() {
        return taskComments;
    }

    public void setTaskComments(String taskComments) {
        this.taskComments = taskComments;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TodoTaskComments{");
        sb.append("todoTaskCommentsId='").append(todoTaskCommentsId).append('\'');
        sb.append(", taskComments='").append(taskComments).append('\'');
        sb.append(", creationDate=").append(creationDate);
        sb.append('}');
        return sb.toString();
    }
}
