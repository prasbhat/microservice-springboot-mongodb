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

@Document
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TodoTaskComments {
    /**
     * Unique Identifier for the To-do task Comments
     */
    @Id
    private String todoTaskCommentsId;

    private String taskComments;
    private LocalDate creationDate;
}
