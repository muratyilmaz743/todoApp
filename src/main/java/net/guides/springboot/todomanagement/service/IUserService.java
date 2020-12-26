package net.guides.springboot.todomanagement.service;
import net.guides.springboot.todomanagement.model.User;

import java.util.List;

public interface IUserService {
    List<User> getUsers();

    void createUser(String name, String pass, String role);

}
