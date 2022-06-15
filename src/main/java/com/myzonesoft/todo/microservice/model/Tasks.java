package com.myzonesoft.todo.microservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Set;

/**
 * To-do POJO model class
 */
@Document
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tasks {
    /**
     * Unique Identifier for the To-do task
     */
    @Id
    private String systemTasksId;
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

    /**
     * To-do task comments model
     */
    private Set<TodoTaskComments> todoTaskCommentsSet;
}
