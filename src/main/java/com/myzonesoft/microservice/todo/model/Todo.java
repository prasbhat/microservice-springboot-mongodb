package com.myzonesoft.microservice.todo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
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
     * Due date for the To-do task
     */
    private LocalDate dueDate;
    /**
     * Status of the To-do task
     */
    private String status;

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

    /**
     * toString method for displaying the To-do POJO class as a String
     * @return String To-do POJO object
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Todo{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", dueDate=").append(dueDate);
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
