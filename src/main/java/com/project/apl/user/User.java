package com.project.apl.user;


public class User {



    String id;



    String name;
    List<Task>tasks = new ArrayList<Task>();



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
