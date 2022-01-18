package com.myzonesoft.microservice.todo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document
@SuppressWarnings("unused")
public class Todo {
    /**
     * Unique Identifier for the To-do task
     */
    @Id
    private String id;
    /**
     * Title for the To-do task
     */
    private String title;
    /**
     * Description for the To-do task
     */
    private String description;
    /**
     * Creation date- System generated
     */
    private LocalDate creationDate;
    /**
     * Due date for the To-do task
     */
    private LocalDate dueDate;
    /**
     * Status of the To-do task
     */
    private String status;

    private List<TodoTaskComments> todoTaskCommentsList;

    //Constructors
    public Todo() {
    }

    /**
     * Constructor with all parameters
     * @param title Title for the To-do task
     * @param description Description for the To-do task
     * @param dueDate Due date for the To-do task
     * @param status Status of the To-do task
     * @param creationDate System generated creation date of the to do task
     * @param todoTaskCommentsList Comments related to the to do task
     */
    public Todo(String title, String description, LocalDate creationDate, LocalDate dueDate, String status, List<TodoTaskComments> todoTaskCommentsList) {
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.status = status;
        this.todoTaskCommentsList = todoTaskCommentsList;
    }

    //Getters and setters for all the private variables declared above
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public List<TodoTaskComments> getTodoTaskCommentsList() {
        return todoTaskCommentsList;
    }

    public void setTodoTaskCommentsList(List<TodoTaskComments> todoTaskCommentsList) {
        this.todoTaskCommentsList = todoTaskCommentsList;
    }

    /**
     * toString method for displaying the To-do POJO class as a String
     *
     * @return String To-do POJO object
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Todo{");
        sb.append("id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", creationDate=").append(creationDate);
        sb.append(", dueDate=").append(dueDate);
        sb.append(", status='").append(status).append('\'');
        sb.append(", todoTaskCommentsList=").append(todoTaskCommentsList);
        sb.append('}');
        return sb.toString();
    }
}
