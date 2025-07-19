package com.project.apl.user;

import java.util.ArrayList;

public class UserRepo {
    public ArrayList<User> getUsers() {
        return users;
    }



    ArrayList<User> users;

    public UserRepo() {
        users = new ArrayList<>();
        //Manual Add Users May not need to

    }
    //Adds User
    public void addUser(User user) {
        users.add(user);

    }

    //get a User

    public void removeUser(User user) {
        users.remove(user);
    }

    public User getUser(int id) {
        //retrieves the user based on the ID it has generated
        return users.get(id);
    }

    public List<Task> getUserTask(int id){

        return users.get(id).getTasks();
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }






}
