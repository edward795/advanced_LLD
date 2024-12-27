package org.example.Design_SplitWise.User;

import java.util.List;

public class UserController {
    List<User> usersList;

    public UserController() {
    }

    public UserController(List<User> usersList) {
        this.usersList = usersList;
    }

    public void addUser(User user) {
        usersList.add(user);
    }

    public User getUser(String userId) {
        for (User user : usersList) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }
}
