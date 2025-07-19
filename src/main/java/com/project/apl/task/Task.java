package com.project.apl.task;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Task implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String assignedTo;

    public Task() {
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly
    }
    public Task(String name, String category, String assignedTo) {
        this.name = name;
        this.category = category;
        this.assignedTo = assignedTo;
    }

    public String getName() {
        return this.name;
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

    // ... etc

}
