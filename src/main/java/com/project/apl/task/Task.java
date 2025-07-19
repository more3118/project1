package com.project.apl.task;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Task implements Serializable {

    @Id
    @GeneratedValue
    private Long id; //1

    @Column(nullable = false)
    private String name; //2
    @Column(nullable = false)
    private String category; //3

    @Column(nullable = false)
    private String assignedTo; // 4
    @Column(nullable = false)
    private boolean completed; //5

    public Task() {
    }
    public Task(String name, String category, String assignedTo,boolean completed) {
        this.name = name;
        this.category = category;
        this.assignedTo = assignedTo;
        this.completed = completed;
    }

    public String getName() {
        return this.name;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public String getAssignedTo() {
        return this.assignedTo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}
